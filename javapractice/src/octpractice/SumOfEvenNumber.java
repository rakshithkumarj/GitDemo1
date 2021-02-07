package octpractice;

public class SumOfEvenNumber {

	public static void main(String[] args) {
	int sum=0;
	int num=10;
	for(int i=2;i<=10;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
System.out.println(sum);
	}

}
