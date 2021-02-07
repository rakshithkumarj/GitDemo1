package octpractice;

public class StaticBlockConcept {
	
	static String str="Rakshith";
	
	public static void m1()
	{
		System.out.println("print m1");
	}
	
	static
	{
		System.out.println("Print static ");
	}


	public static void main(String[] args) {
		System.out.println(str);

	}

}
