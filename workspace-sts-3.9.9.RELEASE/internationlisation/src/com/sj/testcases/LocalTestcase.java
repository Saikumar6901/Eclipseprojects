package com.sj.testcases;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.I18N.International;

public class LocalTestcase {

	public LocalTestcase() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		AbstractApplicationContext appcon=new ClassPathXmlApplicationContext("i18nbeans.xml");
		International in=(International)appcon.getBean("localisation");
		in.getMsg();
	}
}
