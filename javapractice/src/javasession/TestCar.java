package javasession;

public class TestCar extends Car{

	public static void main(String[] args) {
		
	
	Car.stop();
	TestCar c= new TestCar();
	c.stop();
	c.start();
	c.refuel();
	c.horn();
	TestCar.stop();

	System.out.println(Car.x);
	System.out.println(x);
	System.out.println(c.y);
	   
		

	}

	@Override
	public void horn() {
		System.out.println("horn method from test car");
		
	}

}
