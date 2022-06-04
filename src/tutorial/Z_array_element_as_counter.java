package tutorial;

import java.util.Random;

public class Z_array_element_as_counter {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int array1[] = new int[7];							// Creates elements(0 to 6)
		
		for (int roll=1;roll<1000;roll++) {
			++array1[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for (int face=1;face<array1.length;face++) {
			System.out.println(face + "\t" + array1[face]);
		}
	}
}
