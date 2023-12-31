package com.docsconsole.tutorials.hpackage;

public class Address {

	public String cityName;
	public String stateName;
	public String countryName;

	public Address(String cityName, String stateName, String countryName) {
		
		System.out.println("Constructor@Address with Three arguments");
		
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}

}