package octpractice;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s1="Rakshith          kumar J";
		String s2= "";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				s2= s2+s1.charAt(i);
			}
		}
      System.out.println(s2);
      System.out.println("Second way of doing");
      System.out.println(s1.replaceAll(" ", ""));
      
	}
	
	

}
