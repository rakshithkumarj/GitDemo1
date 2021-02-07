package octpractice;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	String str="Rakshith kumar J";
	String s1="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			s1=s1+str.charAt(i);
		}
	}
   System.out.println(s1);
	}

}
