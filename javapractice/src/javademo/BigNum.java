package javademo;

public class BigNum {

	public static void main(String[] args) {
	int [] num= {2,3,5,7,8,1,34,28,25};
	int big=num[0];
	for(int i=0;i<num.length;i++)
	{
		if(num[i]>big)
		{
			big=num[i];
			
		}
	}
	System.out.println(big);

	}

}
