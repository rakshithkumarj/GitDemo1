package octpractice;

public class FindBigNum {

	public static void main(String[] args) {
		int [] numbers= {3,2,4,7,23,20,19,17};
	    int big=numbers[0];
	    for(int i=0;i<numbers.length;i++)
	    	
	    {
	    	if(big<numbers[i])
	    	{
	    		big=numbers[i];
	    	}
	    }
		System.out.println(big);

	}

}
