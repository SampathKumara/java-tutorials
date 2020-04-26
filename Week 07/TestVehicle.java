class Vehicle{
	int passengers;			//number of passenges
	float fuelCapacity;		//fuel capacity in Liters
	float fuelEfficiency;	//Kilometers per Liters
	
	float range(){
		return fuelCapacity * fuelEfficiency;
	}
	
	float fuelNeeded(float kilometers){
		return kilometers / this.fuelEfficiency;
	}
	
	float getCost(float km,float price){ //Price per liter
		float fuelAmount = this.fuelNeeded(km);
		return fuelAmount * price;
	}
}

public class TestVehicle{
	public static void main(String[] args){
		System.out.println("Creating a motorcycle");
		Vehicle motorcycle = new Vehicle();
		motorcycle.passengers = 2;
		motorcycle.fuelCapacity = 5;
		motorcycle.fuelEfficiency = 20;
		showVehicle(motorcycle);
		
		System.out.println("Creating a car");
		Vehicle car = new Vehicle();
		car.passengers = 4;
		car.fuelCapacity = 15;
		car.fuelEfficiency = 12;
		showVehicle(car);
		
		System.out.println("Creating a bus");
		Vehicle bus = new Vehicle();
		bus.passengers = 50;
		bus.fuelCapacity = 40;
		bus.fuelEfficiency = 5.5f;
		showVehicle(bus);	
	}
	
	static void showVehicle(Vehicle v){
		System.out.println("Passengers:\t" + v.passengers);
		System.out.println("Fuel Capacity:\t" + v.fuelCapacity + " L");
		System.out.println("Fuel Economy:\t" + v.fuelEfficiency + " km/L");
		System.out.println("Has range of \t" + v.range() + " km");
		System.out.println("Fuel Required for going 100 km:\t" + v.fuelNeeded(100) + " L");
		System.out.println("Cost for going 100 is Rs.\t" + v.getCost(100, 137.50f));
		System.out.println();
	}
}

