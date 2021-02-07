package abstraction;

public class SortArray {

	public static void main(String[] args) {
    int [] num= {3,5,6,8,1,3,8,9,10,99,98,100};
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


	}

}
