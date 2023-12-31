package com.docsconsole.tutorials.ipackage;

public class MainClient {

	public static void main(String[] args) {
		PersonAddress pAddress = MainClient.getpersonAddress();
		//Copy Constructor Call
		PersonAddress personAddress = new PersonAddress(pAddress);
		PersonAddress personAddress1 = new PersonAddress("Harly", "Warner");
		System.out.println("First Name::: " + personAddress.firstName + " ::: Last Name::: " + personAddress.lastName);
		System.out.println("First Name::: " + personAddress1.firstName + " ::: Last Name::: " + personAddress1.lastName);
	}

	private static PersonAddress getpersonAddress() {

		PersonAddress personAddress = new PersonAddress("David", "Jhonson");
		return personAddress;

	}
}