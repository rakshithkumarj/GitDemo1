package abstraction;

public class SumofNaturalNumber {

	public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<=5;i++)
	{
	if(i%2==0)
	{
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println(sum);
	}
	}}
