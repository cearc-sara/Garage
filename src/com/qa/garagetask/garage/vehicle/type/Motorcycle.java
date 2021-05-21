package com.qa.garagetask.garage.vehicle.type;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Motorcycle extends Vehicle{
	private boolean hasSideCar;
	private boolean windshield;

	public Motorcycle(String manufacturer, String model, int doors, boolean hasTires, boolean hasSideCar, boolean windshield, double price) {
		super(manufacturer, model, doors, hasTires, price);
		this.hasSideCar = hasSideCar;
		this.windshield = windshield;
		this.type = "MOTORCYCLE";
	}

	public boolean getSideCar() {
		return hasSideCar;
	}
	
	public boolean hasWindshield() {
		return windshield;
	}

	@Override
	public double getPrice() {
		double taxes = super.getPrice() / 200 * 40;
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
