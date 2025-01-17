package com.example.demo.restcontroller;

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

import com.example.demo.Customer_Details;
import com.example.demo.registration;
import com.example.demo.dao.Customer_Details_Dao;
import com.example.demo.dao.RegisDBDao;

@RestController
@RequestMapping("/webs")
public class MyRestController {
	@Autowired
	RegisDBDao dao;

	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
	
	@GetMapping("/registrations")
	public List<registration> getAllDetails(){
		return dao.findAll();
	}
	
	@GetMapping("/registrations/{account_no}")
	public Optional<registration> getAllById(@PathVariable String account_no){
		return dao.findById(account_no);
	}
	
	@PostMapping("/registrations")
	public String createDetails(@RequestBody registration r){
		if(dao.existsById(r.getAccount_no())){
			return "account already exists";
		}
		dao.save(r);
		return "Created successfully";
	}
	
	@PutMapping("/registrations")
	public String updateDetails(@RequestBody registration r){
		if(dao.existsById(r.getAccount_no())){
			dao.save(r);
			return "Updated successfully";
		}
		return "account doesn't exists";
	}	
	
	@DeleteMapping("/registrations/{account_no}")
	public String deleteDetails(@PathVariable String account_no){
		if(dao.existsById(account_no)){
			dao.deleteById(account_no);
			return "delete successfully";
		}
		return "account doesn't exists";
	}	
}


@RestController
@RequestMapping("/bank")
class MyRestControllerOfCustDetails {
	@Autowired
    Customer_Details_Dao dao;
	@GetMapping(value="hi")
	public String sayHi() {
		return "Hello World!";
	}
	
	@GetMapping("/CustDetails")
    public List<Customer_Details> getDetails() {
   	 return dao.findAll();
    }
    
	@GetMapping("/CustDetails/{cust_id}")
    public Optional<Customer_Details> getDetailsById(@PathVariable int cust_id) {
   	 return dao.findById(cust_id);
    }
	
	@PutMapping("/CustDetails")
	public String updateDetails(@RequestBody Customer_Details c) {
	  int id = c.getCust_id();
	   if(dao.existsById(id)) {
		   dao.save(c);
		   return "Successfully updated";
	   }	  
	   else
		   return "Cannot find record";
    }
	
	@PostMapping("/CustDetails")
	public String addDetails(@RequestBody Customer_Details c) {
		int id=c.getCust_id();
		if(dao.existsById(id)) {
			   return "Record already exists";
		   }	  
		   else {
			   dao.save(c);
			   return "Sccessfully added";
		   }
			   
    }
	
	@DeleteMapping("/CustDetails/{id}")
	public String deleteBook(@PathVariable("id") Integer id) {
		if(dao.existsById(id)) {
			dao.deleteById(id);
			return "Successfully Deleted record";
		}
		else {
			return "Record not found";
		}
	}
}