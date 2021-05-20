package com.qa.garagetask;

public abstract class Vehicle {
	// Attribute
	private boolean hasTires;
	private int doors;
	private String manufacturer;
	private String model;
	
	// Constructor
	public Vehicle(String manufacturer, String model, int doors) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.doors = doors;
		this.hasTires = true;
		
	}
	
	// Methods
	
	
	public boolean hasTires() {
		return hasTires;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	

	

}