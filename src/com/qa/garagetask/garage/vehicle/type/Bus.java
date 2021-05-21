package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Bus extends Vehicle{
	private int capacity;
	private String company;

	public Bus(String manufacturer, String model, int doors, boolean hasTires, int capacity, String company) {
		super(manufacturer, model, doors, hasTires);
		this.capacity = capacity;
		this.company = company;
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Bus Manufacturer: " + this.getManufacturer();
	}

	@Override
	public void parked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void driving() {
		// TODO Auto-generated method stub
		
	}

	

}
