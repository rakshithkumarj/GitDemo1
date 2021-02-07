package octpractice;

public class FindNumberOfWords {

	public static void main(String[] args) {
		String str= "I am an   automation engineer";
	    String[] s1=str.split("\\s+");
	    System.out.println(s1.length);
	    System.out.println("Second way of doing");
	    int count=1;
	    char[] c=str.toCharArray();
	    for(int i=0;i<c.length;i++)
	    {
	    if (str.charAt(i)==' ' && i< str.length()-1  && str.charAt(i+1)!=' ' )
	    {
	    	count++;
	    }
	    }
	    	
System.out.println(count);
	}

}
