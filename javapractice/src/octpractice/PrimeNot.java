package octpractice;

public class PrimeNot {

	public static void main(String[] args) {
	int num=15;
	boolean prime=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			prime=false;
		}
	}
	if(prime==true)
	{
		System.out.println("number is prime");
	}
	else
	{
		System.out.println("number is not a prime");
	}
	}

}
