import java.util.Scanner;

public class Set2Homework {
	public static void main(String[] args) {
		// Problem 1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Problem 2
		System.out.println("Random number game!");
		int num = (int) (Math.random() * 10);
		int guess = -1;
		Scanner scan = new Scanner(System.in);
		while (guess != num) {
			System.out.print("Guess a number: ");
			guess = scan.nextInt();
			if (guess > num) {
				System.out.println("Too high!");
			} else if (guess < num) {
				System.out.println("Too low!");
			} else {
				System.out.println("You win!");
			}
		}

		// Problem 3
		System.out.print("Piggy Bank! Enter a starting amount:");
		double bank = scan.nextDouble();
		while (bank > 0) {
			System.out.printf("You currently have $%.2f", bank); // This is a formatted print statement, always printing
																	// bank with 2 decimal places
			System.out.println();
			System.out.print("How much did you spend? ");
			double spend = scan.nextDouble();
			bank = bank - spend;
		}
		System.out.println("Your piggy bank is empty!");

		// Problem 4
		System.out.print("Enter a number: ");
		int m = scan.nextInt();
		int[][] table = new int[m][m];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= m; j++) {
				table[i - 1][j - 1] = i * j;
			}
		}

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "\t"); // \t is the tab character
			}
			System.out.println();
		}
	}
}
