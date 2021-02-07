package abstraction;

public  abstract class RBI {
	
	public abstract void  credit();
	
	public void  debit()
	{
		System.out.println("RBI debit");
	}
	
	public void loan()
	{
		System.out.println("RBI Loan");
	}
	
	public void carloan()
	{
		System.out.println("rbi car loan");
	}

}
