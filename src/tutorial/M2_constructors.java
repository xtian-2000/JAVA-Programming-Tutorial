package tutorial;

public class M2_constructors {
	private String girlName;
	
	public M2_constructors(String name) {								// This is a constructor
		girlName = name;
	}
	
	public void setName(String name) {									// Use void if method does not return anything
		girlName = name;
	}
	
	public String getName() {											// Use String if method returns a string
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first girlfriend was %s \n", getName());	// \n moves the cursor to the new line 
	}
}
