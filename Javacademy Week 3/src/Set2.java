import java.util.Scanner;
public class Set2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Warm-Up A
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		System.out.println("Enter a number: ");
		int b = scan.nextInt();
		System.out.println("The average is " + (a + b) / 2);
		
		// Warm-Up B
		System.out.println("Enter a number: ");
		int c = scan.nextInt();
		System.out.println("Enter a number: ");
		int d = scan.nextInt();
		System.out.println("Enter a number: ");
		int e = scan.nextInt();
		if ((c > d && d > e) || (e > d && d > c))
			System.out.println(d + " is the middle number.");
		if ((d > c && c > e) || (e > c && c > d))
			System.out.println(c + " is the middle number.");
		if ((c > d && d > e) || (d > e && e > c))
			System.out.println(e + " is the middle number.");
		
		// Warm-Up C
		scan.nextLine();
		System.out.println("Enter a coin: ");
		String coin = scan.nextLine();
		if (coin.charAt(0) == 'p')
			System.out.println("1 cent");
		if (coin.charAt(0) == 'n')
			System.out.println("5 cent");
		if (coin.charAt(0) == 'd')
			System.out.println("10 cent");
		if (coin.charAt(0) == 'q')
			System.out.println("25 cent");

		// Arrays ********************************************
		
		// Problem 1
		int[] myFavoriteNumbers = { 3, 7, 9, 27, 42 };
		System.out.println("My first favorite number is " + myFavoriteNumbers[0]);
		
		// Problem 2
		scan.nextLine();
		String[] words = new String[4];
		words[0] = scan.nextLine();
		words[1] = scan.nextLine();
		words[2] = scan.nextLine();
		words[3] = scan.nextLine();
		System.out.println("The third word entered was " + words[2]);
		
		// Problem 3 - diagonal win!
		char[][] connect4 = { {'Y', 'B', 'O', 'O'}, {'B', 'Y', 'O', 'O'}, {'B', 'Y', 'Y', 'B'}, {'B', 'Y', 'B', 'Y'} };
		System.out.println(connect4[0][0] + " " + connect4[0][1] + " " + connect4[0][2] + " " + connect4[0][3]);
		System.out.println(connect4[1][0] + " " + connect4[1][1] + " " + connect4[1][2] + " " + connect4[1][3]);
		System.out.println(connect4[2][0] + " " + connect4[2][1] + " " + connect4[2][2] + " " + connect4[2][3]);
		System.out.println(connect4[3][0] + " " + connect4[3][1] + " " + connect4[3][2] + " " + connect4[3][3]);

		//	Loops ********************************************
		
		// Problem 1
		int f = 1;
		while (f <= 10) {
			System.out.println(f);
			f++;
		}
		
		// Even only
		int g = 2;
		while (g <= 10) {
			System.out.println(g);
			g += 2;
		}
		
		// Alternate solution
		int h = 1;
		while (h <= 10) {
			if (h%2 == 0)
				System.out.println(h);
			h++;
		}
		
		// Problem 2
		System.out.println("Enter a name: ");
		String name = scan.nextLine();
		while(!name.equals("Stop")) {
			System.out.println("Top o' the morning to you, " + name + "!");
			System.out.println("Enter another name: ");
			name = scan.nextLine();
		}
		
		// Problem 3
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// Odds only
		for (int i = 1; i < 11; i += 2) {
			System.out.println(i);
		}
		
		// Problem 4
		System.out.println("Enter a number: ");
		int lines = scan.nextInt();
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Problem 5
		String[] foods = new String[5];
		scan.nextLine();
		for (int i = 0; i < foods.length; i++) {
			System.out.println("Enter a favorite food: ");
			foods[i] = scan.nextLine();
		}
		
		for (int i = 0; i < foods.length; i++) {
			System.out.println("#" + (i + 1) + ": " + foods[i]);
		}

		//			Challenges
		
		// Problem 1
		int[] teamNumbers = { 5104, 4255, 6506 };
		String[] teamNames = { "BreakerBots", "RoboDores", "Steel Boot"};
		for (int i = 0; i < teamNumbers.length; i++) {
			System.out.println(teamNumbers[i] + ": " + teamNames[i]);
		}
		
		// Problem 2
		char[][] ticTacToe = { {'O', '-', 'X'},
							   {'O', 'X', 'O'},
							   {'X', '-', '-'} };
		System.out.println("The winner is...");
		for(int i = 0; i < 3; i++) {
			if(ticTacToe[i][0]==ticTacToe[i][2] && ticTacToe[i][0]==ticTacToe[i][1] && ticTacToe[i][0] != '-') {
				System.out.println(ticTacToe[i][0]);
				break;
			}
			if(ticTacToe[0][i]==ticTacToe[2][i] && ticTacToe[0][i]==ticTacToe[1][i] && ticTacToe[0][i] != '-') {
				System.out.println(ticTacToe[0][i]);
				break;
			}
		}
		if(ticTacToe[0][0]==ticTacToe[2][2] && ticTacToe[0][0]==ticTacToe[1][1] && ticTacToe[0][0] != '-')
			System.out.println(ticTacToe[0][0]);
		else if(ticTacToe[0][2]==ticTacToe[2][0] && ticTacToe[0][2]==ticTacToe[1][1] && ticTacToe[2][0] != '-')
			System.out.println(ticTacToe[0][2]);
		
		// Problem 3
		System.out.println("How many classes?");
		int classes = scan.nextInt();
		scan.nextLine();
		int sum = 0;
		for (int i = 0; i < classes; i++) {
			System.out.println("Enter a grade: ");
			int grade = scan.nextLine().charAt(0);
			if (grade == 'A')
				sum += 4;
			if (grade == 'B')
				sum += 3;
			if (grade == 'C')
				sum += 2;
			if (grade == 'D')
				sum += 1;
		}
		System.out.println("Your GPA is " + ((double) sum / classes));
		
		// Problem 4
		boolean coPrime = true;
		System.out.println("Enter a number: ");
		int l = scan.nextInt();
		System.out.println("Enter a number: ");
		int m = scan.nextInt();
		int big;
		if (l > m)
			big = l;
		else
			big = m;
		for (int i = 2; i <= big; i++) {
			if (l%i == 0 && m%i == 0)
				coPrime = false;
		}
		if (coPrime)
			System.out.println("Coprime");
		else
			System.out.println("Not coprime");
		
		// Problem 5
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int[] fib = new int[n];
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2; i < n; i++) {
			fib[i] = fib[i - 2] + fib[i - 1];
		}
		System.out.println("The nth term is " + fib[n - 1]);
//			The Fibonacci sequence is a recursive set of numbers where the next term is the sum of the two terms before it, starting with 1 and 1. Write a program that will print out the “nth” term of the Fibonacci sequence when the user enters a number n.

	}
}
