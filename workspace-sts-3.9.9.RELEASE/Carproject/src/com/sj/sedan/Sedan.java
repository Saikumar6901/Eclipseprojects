package com.sj.sedan;

import com.sj.car.Car;

public class Sedan extends Car{
	String model;
	public Sedan() {
		// TODO Auto-generated constructor stub
	}
	public Sedan(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String toString() {
		return color+" "+make+" "+model;
	}

}
