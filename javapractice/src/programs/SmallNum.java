package programs;

public class SmallNum {

	public static void main(String[] args) {
		int [] num= {2,3,5,7,1,20,28,30};
		int small=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<small)
			{
				small=num[i];
			}
		}
		System.out.println(small);

	}

}
