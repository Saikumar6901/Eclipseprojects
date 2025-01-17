package com.testpackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.helloworld.Helloconstrc;
import com.helloworld.Helloworld;

public class TestHelloworld {

	public TestHelloworld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("hellobean.xml"));
		BeanFactory bf1=new XmlBeanFactory(new ClassPathResource("hellobean.xml"));
		// ApplicationContext rootctx = new ClassPathXmlApplicationContext("hellobean.xml");
		Helloworld hw = (Helloworld)bf.getBean("hellobean");
		Helloconstrc hw1 = (Helloconstrc)bf.getBean("construcbean");
		 hw.sayHello();
		 hw1.sayHi();
		 Helloworld hw2 = (Helloworld)bf.getBean("hellobean");
		 if(hw.equals(hw2)) {
			 System.out.println("equals");
		 }
		 else {
			 System.out.println("different references");
		 }
	}


}
