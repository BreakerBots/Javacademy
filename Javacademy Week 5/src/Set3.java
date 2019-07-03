import java.util.Scanner;

public class Set3 {
	public static void main(String[] args) {
//		 Warm-Ups *************************
		
		// Warm-Up #1
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Warm-Up #2 
		Scanner scan = new Scanner(System.in);
		System.out.println("How many inputs?");
		int n = scan.nextInt();
		int[] inputs = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			inputs[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += inputs[i];
		}
		System.out.println("The average value is: " + (double)(sum) / n);
		
//		Methods *******************************
		
		// Methods #1
		printRobotName();

		// Methods #2
		passOrFail(90);
		passOrFail(20);
		
		// Methods #3
		System.out.println(sum(5, 10));

//		 Challenges *************************
		
		// Challenge #1
		getWinner('p', 'p');
		
		// Challenge #2
		String[] myWords = {"This ", "is ", "my ", "sentence " };
		System.out.println(makeAString(myWords));
//		Create a method that takes an array of individual words. Return a String of all the words put together. 

	}

	public static void printRobotName() {
		System.out.println("Nebula is my favorite robot!");
	}

	public static void passOrFail(int grade) {
		if (grade >= 60) {
			System.out.println(grade + " is a passing grade.");
		} else {
			System.out.println(grade + " is a failing grade.");
		}
	}
	
	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void getWinner(char player1, char player2) {
		if ((player1 == 'r' && player2 == 's') || (player1 == 's' && player2 == 'p') || (player1 == 'p' && player2 == 'r')) {
			System.out.println("Player 1 won!");
		} else if ((player2 == 'r' && player1 == 's') || (player2 == 's' && player1 == 'p') || (player2 == 'p' && player1 == 'r')) {
			System.out.println("Player 2 won!");
		} else {
			System.out.println("It's a tie!");
		}
	}
	
	public static String makeAString(String[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
}
