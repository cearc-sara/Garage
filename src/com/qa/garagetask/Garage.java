package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	protected List<Vehicle> garage;
	
	public Garage() {
		super();
		this.garage = new ArrayList<>();
	}
	
	public void addNewVehicle(Vehicle entity) {
		this.garage.add(entity);
	}

	@Override
	public String toString() {
		return "Garage [garage=" + garage + "]";
	}
	
	

}
