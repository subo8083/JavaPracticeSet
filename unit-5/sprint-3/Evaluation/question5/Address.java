package com.question5;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String state;
	private String city;
	private String pin;
	
	public Address(String state, String city,String pin) {
		
		this.state=state;
		this.city=city;
		this.pin=pin;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
	

}
