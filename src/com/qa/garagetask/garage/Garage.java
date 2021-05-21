package com.qa.garagetask.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garagetask.garage.vehicle.Vehicle;

public class Garage {
	
	// Attributes
	private String garageName;
	
	// Constructors
	public Garage() {
		super();
		this.garageName = "Cearc Garage";
	}
	
	public Garage(String garageName) {
		this.garageName = garageName;
	}
	
	// Methods
	List<Vehicle> cearcGarage = new ArrayList<>();
	
	public void addVehicle(Vehicle entity) {
		cearcGarage.add(entity);
	}
	
	public void deleteVehicle(Vehicle entity) {
		cearcGarage.remove(0);
	}
	
	public void getCearcGarage() {
		for (int i = 0; i < cearcGarage.size(); i++) {
			System.out.println(cearcGarage.get(i).toString());
		}
	}
	
	public String getGarageName() {
		return garageName;
	}
	

}
