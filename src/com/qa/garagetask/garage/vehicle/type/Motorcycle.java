package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Motorcycle extends Vehicle{
	private boolean hasSideCar;
	private boolean windshield;

	public Motorcycle(String manufacturer, String model, int doors, boolean hasTires, boolean hasSideCar, boolean windshield) {
		super(manufacturer, model, doors, hasTires);
		this.hasSideCar = hasSideCar;
		this.windshield = windshield;
	}

	public boolean getSideCar() {
		return hasSideCar;
	}
	
	public boolean hasWindshield() {
		return windshield;
	}

	@Override
	public String toString() {
		return "Motorcycle Manufacturer: " + this.getManufacturer();
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
