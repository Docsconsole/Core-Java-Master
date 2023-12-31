package com.docsconsole.tutorials.apackage;

//Class for Employee which contains the Data i.e., Variables and Methods
public class Employee {

	String name = "David Raj";

	public String getName() {
		return this.name;
	}

	public void changeName() {
		this.name = "David John";
	}

	public static void main(String[] args) {

		Employee employee = new Employee(); // Object is created
		System.out.println("The Name of Employee :  " + employee.name);
		employee.changeName();// Method is used to change the name.
		System.out.println("The Name of Employee after changing the name:  " + employee.name);
	}
}
