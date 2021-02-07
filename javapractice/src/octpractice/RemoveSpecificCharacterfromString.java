package octpractice;

public class RemoveSpecificCharacterfromString {

	public static void main(String[] args) {
		String s1="Rakshith";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!='k')
			{
				s2=s2+s1.charAt(i);
			}
		}
			
		System.out.println(s2);

	}

}
