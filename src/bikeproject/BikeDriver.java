package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		
		bike1.printDescription();		//overloading is the same method name with a different parameter list/signature.
		bike2.printDescription();		//overriding is having the same method name in the base class and the derived class.
		bike3.printDescription();
		bike4.printDescription();
	}//end method main

}//end class BikeDriver
