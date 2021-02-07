package octpractice;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s1="789-60-2345";
		StringBuffer sf= new StringBuffer(s1);
		for(int i=0;i<sf.length()-1;i++)
		{
			if(sf.charAt(i)<48 || sf.charAt(i)>57)
			{
				sf.deleteCharAt(i);
				i--;
			
			}		
		
		}
		
		System.out.println(sf);	

	}

}
