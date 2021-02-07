package abstraction;

public class NumerRev {

	public static void main(String[] args) {
		String s1="12345";
		int num=Integer.parseInt(s1);
		String rev="";
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev+rem;
			num=num/10;
		}
System.out.println(rev);
	}

}
