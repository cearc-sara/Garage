package com.qa.garagetask;

public class Bus extends Vehicle{
	private int capacity;
	private String company;

	public Bus(String manufacturer, String model, int doors, int capacity, String company) {
		super(manufacturer, model, doors);
		this.capacity = capacity;
		this.company = company;
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getCompany() {
		return company;
	}

	

}
