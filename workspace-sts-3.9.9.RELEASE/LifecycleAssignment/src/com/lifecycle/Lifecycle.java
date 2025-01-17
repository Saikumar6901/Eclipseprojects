package com.lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Lifecycle implements DisposableBean,InitializingBean{
	int counter=0;
	public Lifecycle() {
		// TODO Auto-generated constructor stub
	}
	public void init() {
		counter++;
		System.out.println("in init "+counter);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		counter++;
		System.out.println("in afterPropertiesSet "+counter);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		counter++;
		System.out.println("in destroy "+counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Lifecycle lf=(Lifecycle)ap.getBean("lifecycle");
		ap.close();
	}
}
