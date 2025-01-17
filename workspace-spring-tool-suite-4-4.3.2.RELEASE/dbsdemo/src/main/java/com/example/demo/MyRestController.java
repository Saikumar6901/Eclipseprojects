package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {
	@Autowired
	EmpDBDao dao;
	@PostMapping("/addemp")
	public String addEmployee(@RequestBody Employee e) {
		if(dao.existsById(e.getEid())) {
			return "record already exists";
		}
		dao.save(e);
		return "Success";
	}
	@GetMapping("/selectall")
	public List<Employee> getEmployees() {
		return dao.findAll();
	}
	@GetMapping("/selectbyid/{eid}")
	public Optional<Employee> getEmployeeById(@PathVariable int eid) {
		return dao.findById(eid);
	}

	@PutMapping("/updateemp")
	public String updateEmployee(@RequestBody Employee e) {
		if(dao.existsById(e.getEid())) {
			dao.save(e);
			return "Success";
		}
		
		return "record doesn't exists";
	}

	@DeleteMapping("/deleteemp/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		if(dao.existsById(eid)) {
			dao.deleteById(eid);
			return "Success";
		}
		return "record doesn't exists";
	}
}
