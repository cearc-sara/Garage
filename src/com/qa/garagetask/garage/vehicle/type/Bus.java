package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Bus extends Vehicle{
	private int capacity;
	private String company;

	public Bus(String manufacturer, String model, int doors, boolean hasTires, int capacity, String company, double price) {
		super(manufacturer, model, doors, hasTires, price);
		this.capacity = capacity;
		this.company = company;
		this.type = "BUS";
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getCompany() {
		return company;
	}

	@Override
	public double getPrice() {
		double taxes = super.getPrice() / 200 * 90;
		return super.getPrice() + taxes;
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
