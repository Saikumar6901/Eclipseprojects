package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	
	@Before(value="execution(* com.example.service.EmployeeService.*(..)) and args(name, empid")
	public void beforeAdvice(JoinPoint joinPoint,String name,String empid) {
		System.out.println("before method: "+joinPoint.getSignature());
		System.out.println("creating emp with name: "+name+" and id: "+empid);
		
	}

}
