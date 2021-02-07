package logics;

public abstract class RBI {

	int i = 10;

	public abstract void credit();

	abstract void loan();

	public void debit()

	{
		System.out.println("RBI Dedit");
	}

	public RBI(int i) {
		this.i = i;
		System.out.println(i);

	}
}
