package com.docsconsole.tutorials.apackage;

public class PersonAddress {

	public PersonAddress() {
		System.out.println("PersonAddress Constructor @PersonAddress");
	}
	
	public String personAddress() {
		return "David, Road No 101, United States of America.";
	}

	public static void main(String[] args) {
		PersonAddress address = new PersonAddress();
		System.out.println("Address in Method@personAddress:: " + address.personAddress());
	}

}
