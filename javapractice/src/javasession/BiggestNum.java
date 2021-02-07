package javasession;

public class BiggestNum {

	public static void main(String[] args) {
	int [] num= {22,4,6,7,1,10,20,30,7};
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
