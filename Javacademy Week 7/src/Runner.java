
public class Runner {
	public static void main(String[] args) {
		Person Mitali = new Person("Mitali", 17, "green");
		Person Amelia = new Person("Amelia", 14, "orange");
		Person Ishani = new Person("Ishani", 12, "white");
		Person Dami = new Person("Dami", 10, "red");
		Person Eric = new Person("Eric", 5104, "red");
		Person[] javaClass = { Mitali, Amelia, Ishani, Dami, Eric };
		
		for (int i = 0; i < javaClass.length; i++) {
			System.out.println(javaClass[i]);
		}
		
		Person.rainyDay();
	}
}
