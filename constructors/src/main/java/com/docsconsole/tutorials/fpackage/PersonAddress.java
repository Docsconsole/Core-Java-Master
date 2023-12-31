package com.docsconsole.tutorials.fpackage;

public class PersonAddress {

	private String firstName;
	private String lastName;
	private String cityName;
	private String stateName;
	private String countryName;

	public PersonAddress(String firstName, String lastName) {
		this(firstName, lastName, "Newyork");
		System.out.println("Constructor@PersonAddress with two arguments");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonAddress(String firstName, String lastName, String cityName) {
		this(firstName, lastName, "Newyork", "Newyork");
		System.out.println("Constructor@PersonAddress with three arguments");
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
	}

	public PersonAddress(String firstName, String lastName, String cityName, String stateName) {
		this(firstName, lastName, "Newyork", "Newyork", "USA");
		System.out.println("Constructor@PersonAddress with four arguments");
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public PersonAddress(String firstName, String lastName, String cityName, String stateName, String countryName) {
		System.out.println("Constructor@PersonAddress with five arguments");
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}

	public static void main(String[] args) {

		PersonAddress address = new PersonAddress("David", "Johnson");
		System.out.println("First Name::: " + address.firstName + " ::: Last Name::: " + address.lastName
				+ " ::: City Name ::: " + address.cityName + " ::: State Name ::: " + address.stateName
				+ " ::: Country Name ::: " + address.countryName);

	}
}