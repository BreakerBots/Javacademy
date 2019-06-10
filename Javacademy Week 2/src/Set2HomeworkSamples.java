import java.util.Scanner;
public class Set2HomeworkSamples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Review 1
		System.out.print("Enter a number: ");
		int a = scan.nextInt();
		System.out.print("Enter another number: ");
		int b = scan.nextInt();
		System.out.print("Enter a math operator: ");
		scan.nextLine();
		String rawIn = scan.nextLine();
		char op = rawIn.charAt(0);
		System.out.print(a + " " + op + " " + b + " = ");
		switch(op) {
		case '+': 
			System.out.print(a + b); 
			break;
		case '-': 
			System.out.print(a - b); 
			break;
		case '*': 
			System.out.print(a * b); 
			break;
		case '/': 
			System.out.print((double) (a) / b); 
			break;
		default:
			System.out.print("Error");
		}
		System.out.println("");
		
		// Review 2
		System.out.print("Enter MM: ");
		int month = scan.nextInt();
		System.out.print("Enter DD: ");
		int day = scan.nextInt();
		System.out.print("Enter YYYY: ");
		int year = scan.nextInt();
		System.out.print("The date is ");
		switch(month) {
			case 1: System.out.print("January"); break;
			case 2: System.out.print("February"); break;
			case 3: System.out.print("March"); break;
			case 4: System.out.print("April"); break;
			case 5: System.out.print("May"); break;
			case 6: System.out.print("June"); break;
			case 7: System.out.print("July"); break;
			case 8: System.out.print("August"); break;
			case 9: System.out.print("September"); break;
			case 10: System.out.print("October"); break;
			case 11: System.out.print("November"); break;
			case 12: System.out.print("December"); break;
		}
		System.out.print(" " + day);
		switch(day) {
			case 1: System.out.print("st"); break;
			case 2: System.out.print("nd"); break;
			case 3: System.out.print("rd"); break;
			default: System.out.print("th"); 
		}
		System.out.print(", " + year);
		System.out.println("");
		
		// Review 3
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if (num < 10)
			System.out.println("1 digit");
		else if (num < 100)
			System.out.println("2 digits");
		else if (num < 1000)
			System.out.println("3 digits");

		// Review 4
		System.out.print("Enter three triangle side lengths: ");
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		if((c + d) > e && (d + e) > c && (e + c) > d)
			System.out.println("This is a triangle!");
		else
			System.out.println("This is not a triangle.");

		// Review 5
		System.out.println("What type of robot do you have??");
		int offense = 0;
		int defence = 0;
		int speed = 0;
		int look = 0;
		
		System.out.println("Is your robot tall (t) or short (s)?");
		scan.nextLine();
		char height = scan.nextLine().charAt(0);
		if(height == 't') {
			offense += 1;
			look += 3;
		} else {
			defence += 1;
			look += 2;
		}
		
		System.out.println("Do you score on the rocket ship (r), cargo bay (c), or not at all (n)?");
		char points = scan.nextLine().charAt(0);
		switch(points) {
			case 'r': offense += 4; break;
			case 'c': offense += 2; break;
			case 'n': offense -= 3; break;
		}
		
		System.out.println("Is your robot powder-coated? (y/n)");
		char pced = scan.nextLine().charAt(0);
		if(pced == 'y') {
			look += 3;
		} 
		
		System.out.println("Is your robot built for speed (s), torque (t), or both (b)?");
		char speedy = scan.nextLine().charAt(0);
		if(speedy == 's' || speedy == 'b') {
			offense += 1;
			speed += 3;
		}
		if(speedy == 't' || speedy == 'b') {
			defence += 2;
			speed -= 2;
		}
		
		System.out.println("Finally, how many different subsystems does your robot have?");
		int subsystems = scan.nextInt();
		offense += subsystems;
		defence -= subsystems/2;
		speed -= subsystems/3;
		look -= subsystems;
		
		if(offense > defence && offense > speed && offense > look)
			System.out.println("Your robot is a blue-banner bot! Even the Cheesy Poofs are jealous!");
		else if(defence > offense && defence > speed && defence > look)
			System.out.println("Your robot is a master defender! Better than every box bot!");
		else if(speed > offense && speed > defence && speed > look)
			System.out.println("Your robot is the fastest bot on the field! You can even launch onto L3!");
		else
			System.out.println("Your robot is a beauty! MadTown's robots are ugly next to yours!");
	}
}
