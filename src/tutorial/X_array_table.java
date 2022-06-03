package tutorial;

public class X_array_table {
	public static void main(String[] args) {
		System.out.println("Index\tValue");							// \t separates the input into  cell-like structure
		int array1[] = {5,8,8,5,7,8,5,4,5};							// Creates an array
		
		for (int counter=0; counter<array1.length; counter++) {
			System.out.println(counter + "\t" + array1[counter]);
		}
	}
}
