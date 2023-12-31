package com.docsconsole.tutorials.bpackage;

//Class for Employee which contains the Data i.e., Fields (Variables) and Methods
public class Employee {
	
	// Non-static Field (Variable)
	String name = "David Raj";
	
	// Static Field (Variable)
	static int SALARY = 10000;

	public String getName() {
		return this.name;
	}
	
	public void changeName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		System.out.println("The salaray is " + Employee.SALARY);// Salary is common for every employee so made it as Static field.
																// Static filed can be called with Class name

		Employee employee = new Employee(); // object is created 
		System.out.println("The Employee Name is: " + employee.name);// Non-Static filed should be called with object reference
		System.out.println("Employee salary is: " + employee.SALARY);// Static filed can be called with object reference but it is not recommendable

		Employee employee1 = new Employee(); // object is created 
		System.out.println("The Employee Name is: " + employee1.name);// Non-Static filed should be called with object reference
		System.out.println("Employee salary is: " + employee1.SALARY);// Static filed can be called with object reference but it is not recommendable
		
		employee.changeName("David John");
		System.out.println("The Non-Static Field nameeis " + employee.name);// Name of employee object is changed.
		System.out.println("The Non-Static Field nameeis " + employee1.name);// Name of employee1 object is not changed.
	}

}
