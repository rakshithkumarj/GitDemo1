package logics;

public class AxisBank extends RBI {

	public AxisBank(int i) {
		
		super(i);
		
		
	}

	@Override
	public void credit() {
		System.out.println("Axis Credit");

	}

	@Override
	void loan() {
		System.out.println("Axis loan");

	}

}
