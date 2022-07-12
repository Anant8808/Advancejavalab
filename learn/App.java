package com.example.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/learn/config.xml");

		Student bean = context.getBean("student", Student.class);
		Branch bean2 = context.getBean("branch", Branch.class);

		System.out.println(bean);

		System.out.println(bean2.getName());
		System.out.println(bean2.getStudent());

	}
}
