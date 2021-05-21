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
		if(cearcGarage == null) {
			cearcGarage = new ArrayList<>();
		}
		cearcGarage.add(entity);
		System.out.println(entity.getMake() + "\s" + entity.getType() + " entered the garage");
	}
	
	public void deleteVehicle(Vehicle entity) {
		for(int i = 0; i < cearcGarage.size(); i++) {
			System.out.println(cearcGarage.remove(i) + "left the garage");
		}
		
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
