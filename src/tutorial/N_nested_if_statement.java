package tutorial;

public class N_nested_if_statement {
	public static void main(String[] arg) {
		int age = 60;
		
		if (age < 50) {
			System.out.println("You are young!");
		} else {
			System.out.println("You are old");
			if (age > 70) {
				System.out.println("You are REALLY old!");
			} else {
				System.out.println("You are not that old");
			}
		}
	}
}
