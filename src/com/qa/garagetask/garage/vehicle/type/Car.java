package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Car extends Vehicle{
	private int seats;
	private String color;

	public Car(String manufacturer, String model, int doors, boolean hasTires, int seats, String color) {
		super(manufacturer, model, doors, hasTires);
		this.seats = seats;
		this.color = color;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Car Manufacturer: " + this.getManufacturer();
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
