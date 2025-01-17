package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer_Details {
	@Id
	int cust_id;
	String cust_firstname;
	String cust_middlename;
	String cust_lastname;
	String phno;
	String email;
	String cust_address;
	String cust_pan;


	
	public Customer_Details(int cust_id, String cust_firstname, String cust_middlename, String cust_lastname, String phno,
			String email, String cust_address, String cust_pan) {
		super();
		this.cust_id = cust_id;
		this.cust_firstname = cust_firstname;
		this.cust_middlename = cust_middlename;
		this.cust_lastname = cust_lastname;
		this.phno = phno;
		this.email = email;
		this.cust_address = cust_address;
		this.cust_pan = cust_pan;
	}

	public Customer_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	

	public String getCust_firstname() {
		return cust_firstname;
	}

	public void setCust_firstname(String cust_firstname) {
		this.cust_firstname = cust_firstname;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_pan() {
		return cust_pan;
	}

	public void setCust_pan(String cust_pan) {
		this.cust_pan = cust_pan;
	}

	public String getCust_middlename() {
		return cust_middlename;
	}

	public void setCust_middlename(String cust_middlename) {
		this.cust_middlename = cust_middlename;
	}

	public String getCust_lastname() {
		return cust_lastname;
	}

	public void setCust_lastname(String cust_lastname) {
		this.cust_lastname = cust_lastname;
	}

	@Override
	public String toString() {
		return "Customer_Details [cust_id=" + cust_id + ", cust_firstname=" + cust_firstname + ", cust_middlename="
				+ cust_middlename + ", cust_lastname=" + cust_lastname + ", phno=" + phno + ", email=" + email
				+ ", cust_address=" + cust_address + ", cust_pan=" + cust_pan + "]";
	}

	
	

}
