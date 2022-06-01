package tutorial;

import java.util.Scanner;

public class D_basic_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 			// Create a scanner variable
		
		double fnum, snum, answer; 						// Declare variables
		
		System.out.println("Enter first number: ");   
		fnum = sc.nextDouble();							// Gets user input
		System.out.println("Enter second number: ");   
		snum = sc.nextDouble();							// Gets user input
		answer = fnum + snum;							// Assignment of variable
		System.out.println(answer);
		sc.close();                                    	// Closes the scanner variable
	}
}
