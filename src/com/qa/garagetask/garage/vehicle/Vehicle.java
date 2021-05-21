package com.qa.garagetask.garage.vehicle;

import com.qa.garagetask.garage.Garage;

public abstract class Vehicle extends Garage implements Mobility {
	// Attribute
	private boolean hasTires;
	private int doors;
	private String make;
	private String model;
	private double price;
	protected String type;
	
	
	// Constructor
	public Vehicle() {
		super();
		this.make = "Generic";
		this.model = "Generic";
		this.doors = 2;
		this.hasTires = true;
		this.price = 2000;
		this.type = "Generic";
	}
	
	public Vehicle(String make, String model, int doors, boolean hasTires, double price) {
		this.make = make;
		this.model = model;
		this.doors = doors;
		this.hasTires = hasTires;
		this.price = price;
		
	}
	
	// Methods
	
	
	public boolean hasTires() {
		return hasTires;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Vehicle [hasTires=" + hasTires + ", doors=" + doors + ", make=" + make + ", model=" + model + ", price="
				+ getPrice() + ", type=" + type + "]";
	}
	
	
	

	

}