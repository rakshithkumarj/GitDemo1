package Test;

public class Swaparray {

	public static void main(String[] args) {
	int [] num= {10,20};
	int temp=num[0];//10
	
	for(int i=1;i<num.length;i++)
	{
		num[i-1]=num[i];//num[0]=20
	}
	num[num.length-1]=temp;
	for(int a:num)
	{
		System.out.println(a);
	}

	}
}
