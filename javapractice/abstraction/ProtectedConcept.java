package abstraction;

public class ProtectedConcept {
	
	protected int i=10;
	protected void credit()
	{
		System.out.println("proteted credit method");
	}
	
	public void debit()
	{
		System.out.println("unprotected debit");
	}

}
