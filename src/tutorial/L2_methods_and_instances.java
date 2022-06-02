package tutorial;

public class L2_methods_and_instances {
	private String girlName;
	
	public void setName(String name) {									// Use void if method does not return anything
		girlName = name;
	}
	
	public String getName() {											// Use String if method returns a string
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first grilfriend was %s", getName());
	}
}
