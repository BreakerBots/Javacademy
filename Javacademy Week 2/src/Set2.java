import java.util.Scanner;
public class Set2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Practice 2
		System.out.print("Enter a number between 1 and 5: ");
		int a = scan.nextInt();
		switch(a) {
			case 0: System.out.println("Zero"); break;
			case 1: System.out.println("One"); break;
			case 2: System.out.println("Two"); break;
			case 3: System.out.println("Three"); break;
			case 4: System.out.println("Four"); break;
			case 5: System.out.println("Five"); break;
			default: System.out.println("Oops");
		}
		
		// Practice 3
		System.out.print("Enter your team number: ");
		int team = scan.nextInt();
		switch(team) {
			case 5104: System.out.println("BreakerBots"); break;
			case 4255: System.out.println("RoboDores"); break;
			case 6506: System.out.println("Steel Boot"); break;
			default: System.out.println("Another great team");
		}
		
		// Practice 4
		char grade = 'A';
		switch(grade) {
			case 'A':
			case 'B':
			case 'C': System.out.println("Pass"); break;
			case 'D':
			case 'F': System.out.println("Fail"); break;
		}

		// Challenge
		System.out.print("What coin do you have? ");
		scan.nextLine();
		String rawInput = scan.nextLine();
		char coin = rawInput.charAt(0);
		System.out.print("Your coin is worth ");
		switch(coin) {
			case 'p': case 'P': System.out.print(1); break;
			case 'n': case 'N': System.out.print(5); break;
			case 'd': case 'D': System.out.print(10); break;
			case 'q': case 'Q': System.out.print(25); break;
			case 'h': case 'H': System.out.print(50); break;
		}
		System.out.print(" cents.");
	}
}
