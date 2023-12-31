package com.docsconsole.tutorials.ipackage;

public class PersonAddress {

	public String firstName;
	public String lastName;

	public PersonAddress(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonAddress(PersonAddress address) {

		this.firstName = address.firstName;
		this.lastName = address.lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}