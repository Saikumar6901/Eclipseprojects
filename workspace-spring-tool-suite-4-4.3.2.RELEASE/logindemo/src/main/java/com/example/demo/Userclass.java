package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Userclass {
	private String uname;
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Userclass [uname=" + uname + ", pwd=" + pwd + "]";
	}

	
	
}