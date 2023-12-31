package com.docsconsole.tutorials.cpackage;

//Class for Employee which contains the Data i.e., Variables and Methods
public class Employee {

	// Non-static Field
	String name = "David Raj";

	// Static Field
	int salary = 10000;

	// getter and setter methods for all Non-static Fields

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
