package com.qa.garagetask.garage.vehicle;

import com.qa.garagetask.garage.Garage;

public abstract class Vehicle extends Garage implements Mobility {
	// Attribute
	private boolean hasTires;
	private int doors;
	private String manufacturer;
	private String model;
	
	// Constructor
	public Vehicle() {
		super();
		this.manufacturer = "Generic";
		this.model = "Generic";
		this.doors = 2;
		this.hasTires = true;
	}
	
	public Vehicle(String manufacturer, String model, int doors, boolean hasTires) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.doors = doors;
		this.hasTires = hasTires;
		
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