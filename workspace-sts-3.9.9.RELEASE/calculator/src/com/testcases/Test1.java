package com.testcases;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.user.User;

public class Test1 {

	public Test1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BeanFactory bf=new XmlBeanFactory(new ClassPathResource("calcxml.xml"));
		  User user=(User)bf.getBean("user"); 
		  user.addVariables();
		 
//        ApplicationContext rootctx = new ClassPathXmlApplicationContext("calcxml.xml");
//        User user1=(User)rootctx.getBean("user");
//        user1.addVariables();
	}
}
