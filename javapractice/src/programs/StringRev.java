package programs;

public class StringRev {

	public static void main(String[] args) {
	String str="tot";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
    if(rev.equals(str))
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("not a palindrome");
    }
	}

}
