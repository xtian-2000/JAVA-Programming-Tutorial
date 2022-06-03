package tutorial;

import java.util.Random;

public class V_random_number_generator {
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=5; counter++) {
			number = 1 + dice.nextInt(6);				// 1 + the output of the random variable (0-5)
			System.out.println(number);
		}
	}
}
