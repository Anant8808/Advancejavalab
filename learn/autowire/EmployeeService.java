package com.example.learn.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {


	private Employee employee;

	private Address address;

	public EmployeeService() {

	}

	public EmployeeService(Employee employee, Address address) {

		this.employee = employee;
		this.address = address;

		System.out.println("autowiring using constructor");
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
