package logics;

abstract class RBIBank {

	public void credit() {
		System.out.println("RBI Credit");
	}

	public abstract void debit();

	public abstract void loan();
	
	public void carLoan()
	{
		System.out.println("RBI carloan method");
	}

}
