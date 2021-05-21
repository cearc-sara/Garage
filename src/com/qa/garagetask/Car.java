package com.qa.garagetask;

public class Car extends Vehicle{
	private int seats;
	private String color;

	public Car(String manufacturer, String model, int doors, int seats, String color) {
		super(manufacturer, model, doors);
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
		return "Car [seats=" + seats + ", color=" + color + "]";
	}

	

}
