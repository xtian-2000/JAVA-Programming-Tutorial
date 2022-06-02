package tutorial;

//imports packages
import java.util.Scanner;

public class Q_simple_averaging_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			System.out.println("Enter your grade: ");
			grade = sc.nextInt();
			total += grade;
			counter++;
			System.out.println(10 - counter + " entries remaining");
		}
		average = total/10;
		System.out.println("Your average grade is " + average);
		sc.close();
	}
}
