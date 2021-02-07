package Demo;

public class AscendingOrder {

	public static void main(String[] args) {
	int [] num= {2,5,3,4,9,10,7,6,1};
	int size=num.length;
	int temp;
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]>num[j])
			{
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			
		}
		System.out.println(num[i]);
	}
	System.out.println("first biggest number is="+num[size-1]);
	System.out.println("second biggest number is="+num[size-2]);
	}

}
