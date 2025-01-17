package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class registration {
	@Id
	String account_no;
	String pan_no;
	String firstname;
	String middlename;
	String lastname;
	String phone_no;
	String email_id;
	Date date_of_birth;
	String address;
	int zipcode;
	String account_type;
	double balance;
	int customer_id;
	String ifsc_code;
	public registration() {}
	public registration(String account_no, String pan_no, String firstname, String middlename, String lastname,
			String phone_no, String email_id, Date date_of_birth, String address, int zipcode, String account_type,
			double balance, int customer_id, String ifsc_code) {
		super();
		this.account_no = account_no;
		this.pan_no = pan_no;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.zipcode = zipcode;
		this.account_type = account_type;
		this.balance = balance;
		this.customer_id = customer_id;
		this.ifsc_code = ifsc_code;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	@Override
	public String toString() {
		return "registration [account_no=" + account_no + ", pan_no=" + pan_no + ", firstname=" + firstname
				+ ", middlename=" + middlename + ", lastname=" + lastname + ", phone_no=" + phone_no + ", email_id="
				+ email_id + ", date_of_birth=" + date_of_birth + ", address=" + address + ", zipcode=" + zipcode
				+ ", account_type=" + account_type + ", balance=" + balance + ", customer_id=" + customer_id + ", ifsc="
				+ ifsc_code + "]";
	}
	
}
