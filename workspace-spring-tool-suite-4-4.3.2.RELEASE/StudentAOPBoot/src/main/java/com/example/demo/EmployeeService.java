package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EmployeeService {

	public Employee createEmployee( String empid, String name) {
		Employee e=new Employee();
		e.setEmpid(Integer.parseInt(empid));
		e.setName(name);
		return e;
	}
	public void deletEmployee( String empid) {
		System.out.println("delete the employee bearing id: "+empid);
	}
	public List<Employee> getAllEmployees(){
		Employee e=new Employee();
		return (List<Employee>) e;
	}
}
