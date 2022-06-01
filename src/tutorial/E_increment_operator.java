package tutorial;

public class E_increment_operator {
	public static void main(String[] args) {	
		int fnum = 5;
		int snum = 10;
		
		System.out.println(++fnum);						// Increments value +1 immediately 
		System.out.println(fnum++);						// Increments value +1 after declaration
		System.out.println(--snum);						// Increments value -1 immediately 
		System.out.println(snum--);						// Increments value -1 after declaration
		System.out.println(fnum += 8);					// shorthand for variable = variable + value
		
	}
}
