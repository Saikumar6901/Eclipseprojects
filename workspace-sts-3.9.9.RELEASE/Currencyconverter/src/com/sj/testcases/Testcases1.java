package com.sj.testcases;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.currency.Visitor;

public class Testcases1 {
	public Testcases1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AbstractApplicationContext ap1=new ClassPathXmlApplicationContext("beans1.xml");
			Visitor v=(Visitor)ap1.getBean("visitor");
			//v.getDetails();
			System.out.println(v);
	}
}
