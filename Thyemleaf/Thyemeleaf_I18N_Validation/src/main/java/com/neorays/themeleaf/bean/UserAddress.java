package com.neorays.themeleaf.bean;

public class UserAddress {
	private String address;
	private String city;
	private String  pin_code;
	private String state;
	private String country;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		
		System.out.println("Address Setters...");
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserAddress [address=" + address + ", city=" + city
				+ ", pin_code=" + pin_code + ", state=" + state + ", country="
				+ country + "]";
	}
	public UserAddress(String address, String city, String pin_code,
			String state, String country) {

		this.address = address;
		this.city = city;
		this.pin_code = pin_code;
		this.state = state;
		this.country = country;
	}
	public UserAddress() {
		System.out.println("Address");
	}
	
	
	
	

}
