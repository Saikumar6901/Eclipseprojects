package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	@Value("telengana")
	private String state;
	@Value("nlg")
	private String city;
	@Value("508001")
	private int pin;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
