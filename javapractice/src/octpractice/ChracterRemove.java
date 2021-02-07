package octpractice;

public class ChracterRemove {

	public static void main(String[] args) {
    String s1="Bangalore";
    String s2=" ";
    for(int i=0;i<s1.length();i++)
    {
    	if(s1.charAt(i)!='a')
    	{
    		s2=s2+s1.charAt(i);
    	}
    }
    System.out.println(s2);
    String s3="Rakshith kumar J";
    String s4="";
	for(int i=0;i<s3.length();i++)
		
	{
		if(s3.charAt(i)!='k')
		{
			s4=s4+s3.charAt(i);
		}
	}
      System.out.println("Removing K from rakshith::"+s4);
	}
	
	

}
