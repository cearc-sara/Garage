package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Car extends Vehicle{
	private int seats;
	private String color;

	public Car(String manufacturer, String model, int doors, boolean hasTires, int seats, String color, double price) {
		super(manufacturer, model, doors, hasTires, price);
		this.seats = seats;
		this.color = color;
		this.type = "CAR";
	}
	
	public int getSeats() {
		return seats;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public double getPrice() {
		double taxes = super.getPrice() / 200 * 70;
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
