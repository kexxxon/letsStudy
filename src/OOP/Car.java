package OOP;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // Default constructor
	
	Car(String c, String g, int d) { // Constructor with parameter
		color = c;
		gearType = g;
		door = d;
		
		// Car c = new Car("white", "auto", 2);
	}
}
