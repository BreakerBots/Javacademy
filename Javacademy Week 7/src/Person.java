
public class Person {
	private String name;
	private int age;
	private String favColor;
	
	public Person(String myName, int myAge, String myFavColor) {
		name = myName;
		age = myAge;
		favColor = myFavColor;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return favColor;
	}
	
	public void birthday() {
		System.out.println("Happy birthday!");
		age++;
	}
	
	public String toString() {
		return name + " is " + age + " years old.";
	}
	
	public static void rainyDay() {
		System.out.println("It is raining!");
	}
}

