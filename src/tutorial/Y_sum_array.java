package tutorial;

public class Y_sum_array {
	public static void main(String[] args) {
		int array1[] = {10,11,12,13,14,15,16,17,18,19,20};
		
		int sum = 0;
		
		for (int counter=0;counter<array1.length;counter++) {
			sum += array1[counter];
		}
		
		System.out.println("The sum of array is " + sum);
	}
}
