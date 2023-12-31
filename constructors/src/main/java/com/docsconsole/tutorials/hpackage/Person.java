package com.docsconsole.tutorials.hpackage;

public class Person extends Address {

	public String firstName;
	public String lastName;

	public Person(String firstName, String lastName) {

		super("Newyork", "Newyork", "USA");
		
		System.out.println("Constructor@Person with Two arguments");
		this.firstName = firstName;
		this.lastName = lastName;
	}

}