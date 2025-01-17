package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	@Autowired
	EmpDBDao dao;
	@Autowired
	DeptDBDao deptdao;
	
	@RequestMapping("/")
	public String welcome() {
		return "Viewall.jsp";
	}
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAll() {
		return dao.findAll().toString();
	}

	@RequestMapping("/displayByID")
	@ResponseBody
	public Optional<Employee> displayEmpById(int eid) {
	return dao.findById(eid);
	}
	
	@RequestMapping("/displayByDesign")
	@ResponseBody
	public List<Employee> displayEmpByDesign(@RequestParam("design") String designation) {
	return dao.findByDesignation(designation);
	}
	
	@RequestMapping("/displayByAge")
	@ResponseBody
	public List<Employee> displayEmpByAge(String designation) {
	return dao.getEmpsSortedByAge(designation);
	}
	
	@RequestMapping("/insertstmt")
	@ResponseBody
	public String insertStmt(Employee emp) {
     	 dao.save(emp);
     	return "success";
	}

	@RequestMapping("/updatestmt")
	@ResponseBody
	public String updateStmt(Employee emp) {
		int id=emp.getEid();
		if(dao.existsById(id)) {
     	 dao.save(emp);
     	return "updated successfully";
     	}
		return "Sorry no such record with that id";
	}

	@RequestMapping("/deletestmt")
	@ResponseBody
	public String deleteStmt(int eid) {
		if(dao.existsById(eid)) {
     	 dao.deleteById(eid);
     	return "deleted successfully";
     	}
		return "Sorry no such record with that id";
	}
	
	@RequestMapping("/collectdata")
	@ResponseBody
	public String CollectInfo(int eid,String deptname) {
     	 Optional<Employee> e=dao.findById(eid);
     	 Department d=deptdao.findByDeptname(deptname);
     	return e+" hi "+d;
	}
}
