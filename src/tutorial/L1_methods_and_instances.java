package tutorial;

import java.util.Scanner;

public class L1_methods_and_instances {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		L2_methods_and_instances l2Object = new L2_methods_and_instances();
		System.out.println("Enter name of your first girlfriend: ");
		String temp = sc.nextLine();
		l2Object.setName(temp);
		l2Object.saying();
		
		sc.close();
	}
}
