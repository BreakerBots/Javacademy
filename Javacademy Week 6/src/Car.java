// This is an example object called Car!
public class Car {
	// These are the attributes that all Car variables will have
	// While they share the variable types, individual values are associated with each instance
	private String color;
	private int wheels;
	private int speed;
	
	// This is the constructor
	// Treat it like any other method, and keep in mind that
	// it will be run whenever you instantiate the object 
	// AKA create a new variable of this type
	public Car(String myColor, int myWheels) {
		// The parameters need to be given a value when you declare a new object
		// Now initialize all the variables in this object
		color = myColor;
		wheels = myWheels;
		speed = 0;
	}
	
	// These are getters - use the methods to get the value of the variable  
	public String getColor() {
		return color;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSpeed() {
		return speed;
	}
	
	// These are setters - use the methods to change the value of the variable
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setWheels(int newWheels) {
		wheels = newWheels;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	
	// You can also have other methods that do a variety of things
	public void speedUp() {
		speed++;
	}
	
	public void brake() {
		System.out.println("screeEEECH");
		speed = 0;
	}
}
