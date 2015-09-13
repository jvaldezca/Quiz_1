package main;

//Import the Scanner
import java.util.Scanner;

public class QB_Rating {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user for the total number of touchdowns
		System.out.print("Enter the total number of touchdowns(TD): ");
		double TD = input.nextDouble();

		// Prompt the user for the total number of yards
		System.out.print("Enter the total number of yards(YDS): ");
		double YDS = input.nextDouble();

		// Prompt the user for the total number of interceptions
		System.out.print("Enter the total number of interceptions(INT): ");
		double INT = input.nextDouble();

		// Prompt the user for the total number of completions
		System.out.print("Enter the total number of completions(COMP): ");
		double COMP = input.nextDouble();

		// Prompt the user for the total number of passes attempted
		System.out.print("Enter the total number of passes attempted(ATT): ");
		double ATT = input.nextDouble();

		// Calculate a
		double a = ((COMP / ATT) - .3) * 5;

		// Calculate b
		double b = ((YDS / ATT) - 3) * .25;

		// Calculate c
		double c = (TD / ATT) * 20;

		// Calculate d
		double d = 2.375 - ((INT / ATT) * 25);

		// Make sure all components are capped at 2.375
		a = (a > 2.375) ? 2.375 : a;
		b = (b > 2.375) ? 2.375 : b;
		c = (c > 2.375) ? 2.375 : c;
		d = (d > 2.375) ? 2.375 : d;

		// Make sure all negative components are set to 0.
		a = (a < 0) ? 0 : a;
		b = (b < 0) ? 0 : b;
		c = (c < 0) ? 0 : c;
		d = (d < 0) ? 0 : d;

		// Calculate QB Rating
		double QB_Rating = ((a + b + c + d) / 6) * 100;

		// Display the QB Rating to 1 decimal place
		System.out.printf("The quarterback rating is %3.1f", QB_Rating);
	}

}
