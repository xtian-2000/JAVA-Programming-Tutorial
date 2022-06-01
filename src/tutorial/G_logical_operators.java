package tutorial;

public class G_logical_operators {
	public static void main(String[] args) {	
		int boy, girl;
		
		boy = 20;
		girl = 50;
		
		System.out.println("Determine if boy or girl is appropriate for dating.");
		
		if (boy > 18 && girl < 60) {  												//using logical operator "AND"
			System.out.println("They can date");									// Both statement should be True
		}else {
			System.out.println("They cannot date");	
		}
		
		if (boy > 18 || girl < 60) {  												// Using logical operator "OR"
			System.out.println("They can date");									// Only one statement is needed to be True
		}else {
			System.out.println("They cannot date");	
		}
	}
}
