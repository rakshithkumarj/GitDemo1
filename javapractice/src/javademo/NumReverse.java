package javademo;

public class NumReverse {

	public static void main(String[] args) {
	  int num=12345;
	  int rem=0;
	  String rev="";
	  int temp;
	  
	  
	  while(num>0)
	  {
		  rem=num%10;
		  rev=rev+rem;
		  num=num/10;
	  }
	  System.out.println(rev);
	}

}
