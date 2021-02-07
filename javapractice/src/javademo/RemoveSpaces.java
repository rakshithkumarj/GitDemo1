package javademo;

public class RemoveSpaces {

	public static void main(String[] args) {
    String str="I am an                         automation expert";
    System.out.println("*******Using Regex*********");
    System.out.println(str.replaceAll("\\s+", ""));
    String s2="";
    for(int i=0;i<str.length();i++)
    {
    	if(str.charAt(i)!=' ')
    	{
    		s2=s2+str.charAt(i);
    	}
    }
    
    System.out.println(s2);

	}

}
