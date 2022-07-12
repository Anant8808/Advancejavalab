package com.example.learn.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/learn/autowire/app.xml");
		EmployeeService bean = context.getBean("employeeService", EmployeeService.class);
		System.out.println(bean.getEmployee());
		System.out.println(bean.getAddress());

	}
}
