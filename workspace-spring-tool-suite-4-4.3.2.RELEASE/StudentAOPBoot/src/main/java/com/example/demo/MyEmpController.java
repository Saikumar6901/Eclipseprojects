/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abridge Solutions
 *
 */

@RestController
@RequestMapping("/web")
public class MyEmpController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/employees")
	public Employee create(@RequestParam String empid,@RequestParam String name) {
		System.out.println("in controller");
		return service.createEmployee(empid, name);
	}
	
	@DeleteMapping("/employees/{empid}")
	public String select(@PathVariable String empid) {
		System.out.println("in controller");
		service.deletEmployee(empid);
		return "delete";
	}
	
}
