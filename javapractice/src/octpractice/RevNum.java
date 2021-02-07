package octpractice;

public class RevNum {

	public static void main(String[] args) {
    int num=1234;
    String rev="";
    int rem=0;
    
    
    while(num>0)
    {
    	rem=num%10;
    	rev=rev+rem;
    	num=num/10;
    	
    }
    
    System.out.println(rev);
	}

}
