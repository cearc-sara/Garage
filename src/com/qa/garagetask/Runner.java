package com.qa.garagetask;

import com.qa.garagetask.garage.Garage;
import com.qa.garagetask.garage.vehicle.Vehicle;
import com.qa.garagetask.garage.vehicle.type.Bus;
import com.qa.garagetask.garage.vehicle.type.Car;
import com.qa.garagetask.garage.vehicle.type.Motorcycle;

public class Runner {

	public static void main(String[] args) {
		Vehicle a = new Car("Pontiac", "Grand AM", 4, true, 5, "White");
		Vehicle b = new Motorcycle("Harley Davison", "GX3", 2, true, false, true);
		Vehicle c = new Bus("Ford", "H3Z2", 3, true, 50, "Johnson and Johnson");
		
		Garage cearcGarage = new Garage("Cearc Garage");
		System.out.println("Welcome to " + cearcGarage.getGarageName());
		
		cearcGarage.addVehicle(a);
		cearcGarage.addVehicle(b);
		cearcGarage.addVehicle(c);
		
		
		cearcGarage.getCearcGarage();
		
		
	
	}

}
