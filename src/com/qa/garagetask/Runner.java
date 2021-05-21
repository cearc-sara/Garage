package com.qa.garagetask;

public class Runner {

	public static void main(String[] args) {
		
		
		Garage myGarage =  new Garage();
		
		myGarage.addNewVehicle(new Car("Dodge", "Charger", 2, 5, "Orange"));
		myGarage.addNewVehicle(new Bus("Chevy", "Cruser", 3, 50, "Walshert Bus Co."));
		
		System.out.println(myGarage);

	}

}
