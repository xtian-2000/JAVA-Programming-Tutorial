package tutorial;

import java.util.Scanner;

public class K1_methods_and_parameters {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		K2_methods_and_parameters k2Object = new K2_methods_and_parameters();
		
		System.out.println("Enter your name here: ");
		String name = sc.nextLine();
		
		k2Object.simpleMessage(name);
		sc.close();
	}
}
