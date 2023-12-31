package com.docsconsole.tutorials.gpackage;

public class PersonAddress {
	private String firstName;
	private String lastName;

	private PersonAddress(String firstName, String lastName) {
		
		System.out.println("Constructor@PersonAddress with two arguments");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args) {

		PersonAddress address = new PersonAddress("David", "Johnson");
		System.out.println("First Name::: " + address.firstName + " ::: Last Name::: " + address.lastName );

	}
	
}