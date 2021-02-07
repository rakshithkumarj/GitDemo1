package javademo;

public class SumFirstastDigit {

	public static void main(String[] args) {
	int num=1234;
	int last_digit=num%10;
	int first_digit=num;
	while(first_digit>10)
	{
		first_digit=first_digit/10;
		
	}
	System.out.println(first_digit);
	System.out.println(last_digit);
	System.out.println(first_digit+last_digit);
	}

}
