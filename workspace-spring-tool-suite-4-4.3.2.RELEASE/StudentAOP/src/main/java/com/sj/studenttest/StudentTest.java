package com.sj.studenttest;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.example.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		XmlBeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("saop.xml"));
		Student mybean=(Student)beanfactory.getBean("StudentProxy");
		mybean.printName();
		System.out.println("------");
		mybean.printCourse();
		System.out.println("------");
	}
}
