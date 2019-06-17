import java.util.Scanner;

public class Set1withInput {
	public static void main(String[] args) {
		// Small note - these are just examples to show how input works
		// but usually, you should prompt the user to enter some input
		Scanner scan = new Scanner(System.in);
		
		// Warm-Up 2
		String name = scan.nextLine();
		System.out.println("Hi " + name + ", how are you doing?");

		// Warm-Up 3
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == b)
			System.out.println("A is the same as B");
		else if (a > b)
			System.out.println("A is greater than B");
		else
			System.out.println("B is greater than A");

		// Practice 1
		int c = scan.nextInt();
		int d = scan.nextInt();
		if (Math.abs(c - d) > 10)
			System.out.println("Difference greater than 10");
		else
			System.out.println("Difference less than 10");

		// Practice 2
		int wheelCost = 7;
		int budget = scan.nextInt();
		if (budget > wheelCost * 4)
			System.out.println("We can build a 4-wheel drive train!");
		if (budget > wheelCost * 6)
			System.out.println("We can build a 6-wheel drive train!");
		if (budget > wheelCost * 8)
			System.out.println("We can build a 8-wheel drive train!");

		// Practice 3
		int e = scan.nextInt();
		if (e >= 5 && e <= 10)
			System.out.println("The number is in between 5 and 10");

		// Practice 4
		if (e < 5 || e > 10)
			System.out.println("The number is not in between 5 and 10");

		// Practice 5
		String password = "JavacademyRocks";
		scan.nextLine();
		String input = scan.nextLine();
		if (password.equals(input))
			System.out.println("The BreakerBots are the best FRC team");

		// Challenge 1
		int f = scan.nextInt();
		if (f % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

		// Challenge 2
		int g = scan.nextInt();
		int h = scan.nextInt();
		if ((g > 8 && h > 8) && (g > h && (g % 3 == 0 || h % 5 == 0)) || (h > g && (h % 3 == 0 || g % 5 == 0)))
			System.out.println("Velociraptor");

		// Challenge 3
		if (a == 0 && b < 0)
			System.out.println("The statement is true");
	}
}
