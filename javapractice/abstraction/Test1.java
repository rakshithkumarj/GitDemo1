package abstraction;

public class Test1 {

	int i = 10;

	public static void run() {
		System.out.println("run");
	}

	private class Test2 {
		int j = 20;
		
		public void walk()
		{
			System.out.println("walk");
		}

	}
	
	
	public static void main(String[] args) {
		
		Test1 t1= new Test1();
		System.out.println(t1.i);
		Test2 t2=t1.new Test2();
		t1.run();
		t2.walk();
		System.out.println(t2.j);
		
		
		
		
	}

}
