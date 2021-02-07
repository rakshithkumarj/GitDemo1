package octpractice;

public class NumberRev {

	public static void main(String[] args) {
		String n = "12345";
		String num=String.valueOf(n);
		int rem = 0;
		String rev = "";
		
		for(int i=num.length()-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}

	/*	while (num > 0) {
			rem = num % 10;
			rev = rev + rem;
			num = num / 10;
		}*/
		System.out.println(rev);
	}

}
