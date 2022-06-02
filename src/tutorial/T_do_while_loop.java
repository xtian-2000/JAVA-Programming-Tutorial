package tutorial;

public class T_do_while_loop {
	public static void main(String[] arg) {
		int counter = 0;
		
		do {									// Do-while loops executes the body before checking the condition
			System.out.println(counter);		// While loop checks the condition before executing the body
			counter++;
		}while(counter <= 10);
	}
	
}
