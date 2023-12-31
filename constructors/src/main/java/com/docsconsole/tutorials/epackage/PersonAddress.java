package com.docsconsole.tutorials.epackage;

public class PersonAddress {

	private String firstName;
	private String lastName;
	private String cityName;
	private String stateName;
	private String countryName;

	public PersonAddress(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PersonAddress(String firstName, String lastName, String cityName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
	}

	public PersonAddress(String firstName, String lastName, String cityName, String stateName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public PersonAddress(String firstName, String lastName, String cityName, String stateName, String countryName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}

	public static void main(String[] args) {
		PersonAddress address = new PersonAddress("David", "Johnson");
		System.out.println("First Name::: " + address.firstName + " ::: Last Name::: " + address.lastName);

		PersonAddress address1 = new PersonAddress("David", "Johnson", "NewYork");
		System.out.println("First Name::: " + address1.firstName + " ::: Last Name::: " + address1.lastName
				+ " ::: City Name ::: " + address1.cityName);

		PersonAddress address2 = new PersonAddress("David", "Johnson", "NewYork", "NewYork");
		System.out.println("First Name::: " + address2.firstName + " ::: Last Name::: " + address2.lastName
				+ " ::: City Name ::: " + address2.cityName + " ::: State Name ::: " + address2.stateName);

		PersonAddress address3 = new PersonAddress("David", "Johnson", "NewYork", "NewYork", "USA");
		System.out.println("First Name::: " + address3.firstName + " ::: Last Name::: " + address3.lastName
				+ " ::: City Name ::: " + address3.cityName + " ::: State Name ::: " + address2.stateName
				+ " ::: Country Name ::: " + address3.countryName);

	}
}