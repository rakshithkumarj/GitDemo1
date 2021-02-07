package Demo;

public class LeftRotate {

	public static void main(String[] args) {
	int [] num= {10,20,30,40,50};
	
	int temp=num[0];
	
	for(int i=1;i<num.length;i++)
	{
		num[i-1]=num[i];
	}
    num[num.length-1]=temp;
	
for(int i:num)
{
	System.out.println(i);
}
}}
