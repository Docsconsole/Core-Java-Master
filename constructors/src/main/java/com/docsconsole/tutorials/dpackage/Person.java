package com.docsconsole.tutorials.dpackage;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		//Parameterized Constructor 
		this.firstName = firstName;
		this.lastName  = lastName;
	}

	public static void main(String[] args) {
		Person address = new Person("David", "Johnson");
		System.out.println("First Name::: " +address.firstName +  " ::: Last Name::: "+ address.lastName);
	}
}