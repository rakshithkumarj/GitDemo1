package octpractice;

public class StringReverse {

	public static void main(String[] args) { 
		
	String s1= "Rakshith kumar J";
	String s2="";
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)	!=' ')
		{
			s2=s2+s1.charAt(i);
		}
    
	}
	System.out.println(s2);
   String rev="";
   for(int i=s2.length()-1;i>=0;i--)
   {
	   rev=rev+s2.charAt(i);
	   
   }
   
   System.out.println(rev);
}
}