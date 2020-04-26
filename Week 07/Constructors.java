class Vehicle{
	int passengers;			//number of passenges
	float fuelCapacity;		//fuel capacity in Liters
	float fuelEfficiency;	//Kilometers per Liters
	
	
	Vehicle(int passengers, float fuelCapacity, float fuelEfficiency){
		this.passengers = passengers;
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
	}	

	float range(){
		return fuelCapacity * fuelEfficiency;
	}
	
	float fuelNeeded(float kilometers){
		return kilometers / fuelEfficiency;
	}	
}

public class Constructors{
	public static void main(String[] args){
		System.out.println("Creating a motorcycle");
		Vehicle motorcycle = new Vehicle(2, 5f, 20f);
		showVehicle(motorcycle);	
		
		System.out.println("Creating a car");
		Vehicle car = new Vehicle(4, 15f, 12f);
		showVehicle(car);	
		
		System.out.println("Creating a bus");
		Vehicle bus = new Vehicle(50, 40f, 5.5f);
		showVehicle(bus);	
	}
	
	static void showVehicle(Vehicle v){
		System.out.println("Passengers:\t" + v.passengers);
		System.out.println("Fuel Capacity:\t" + v.fuelCapacity + " L");
		System.out.println("Fuel Efficiency:\t" + v.fuelEfficiency + " km/L");
		System.out.println("Has range of \t" + v.range() + " km");
		System.out.println("Fuel Required for going 100 km:\t" + v.fuelNeeded(100) + " L");
		System.out.println();
	}
}

