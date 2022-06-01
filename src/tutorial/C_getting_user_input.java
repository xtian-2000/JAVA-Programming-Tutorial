package tutorial;

//imports packages
import java.util.Scanner;

public class C_getting_user_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	// Gets user input
		System.out.println(sc.nextLine());   	// Prints variable
		sc.close();								// Closes the scanner variable
	}
}
