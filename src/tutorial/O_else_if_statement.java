package tutorial;

public class O_else_if_statement {
	public static void main(String[] arg) {
		int age = 45;
		
		if (age >= 60) {
			System.out.println("You are a senior citizen!");
		} 
		else if (age >= 50) {
			System.out.println("You are in your 50's!");
		}	
		else if (age >= 40) {
			System.out.println("You are in your 40's!");
		}
		else {
			System.out.println("You are still young!");
		}
	}
}
