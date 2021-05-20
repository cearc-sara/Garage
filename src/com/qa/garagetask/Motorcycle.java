package com.qa.garagetask;

public class Motorcycle extends Vehicle{
	private boolean hasSideCar;
	private boolean windshield;

	public Motorcycle(String manufacturer, String model, int doors, boolean hasSideCar, boolean windshield) {
		super(manufacturer, model, doors);
		this.hasSideCar = hasSideCar;
		this.windshield = windshield;
	}

	public boolean getSideCar() {
		return hasSideCar;
	}
	
	public boolean hasWindshield() {
		return windshield;
	}
	

}
