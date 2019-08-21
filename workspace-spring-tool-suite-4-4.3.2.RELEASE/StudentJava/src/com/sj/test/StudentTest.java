package com.sj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlBeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("aop.xml"));
		Student mybean=(Student)beanfactory.getBean("StudentProxy");
		mybean.printName();
		System.out.println("------");
		mybean.printCourse();
		System.out.println("------");
		//System.out.println(1/0);
	}

}
