// This class is my main class that runs all the code!
public class Runner {
	// Remember - the main method is what 
	public static void main (String[] args) {
		// Create a new instance of my Car object with specific variable values
		Car prius = new Car("silver", 4);
		// Use methods from the object
		System.out.println("My prius is " + prius.getColor());
		prius.speedUp();
		prius.speedUp();
		prius.speedUp();
		System.out.println("My prius is going at a speed of " + prius.getSpeed());
		prius.brake();
		System.out.println("Now my prius is going at a speed of " + prius.getSpeed());
		// Create another instance of the Car object
		Car ferrari = new Car("red", 7);
		System.out.println("My ferrari has " + ferrari.getWheels() + " wheels!");
	}
}
