package abstraction;

public class WrapperConcept {

	public static void main(String[] args) {
		String s1="100";
	int n=	Integer.parseInt(s1);//Converting from string to Integer
		System.out.println(n+20);
		
		String s2="10.5";
		double d=Double.parseDouble(s2);
		System.out.println(d+1.5);
		
		int num=10;
		String s=String.valueOf(10);
		System.out.println(s+50);

	}

}
