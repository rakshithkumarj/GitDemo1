package octpractice;

public class CountWords {

	public static void main(String[] args) {
		String str="Rakshith is an auotmaiton engineer";
		char[] chars=str.toCharArray();
		System.out.println(chars);
		int count = 1;
		for(int i=0;i<chars.length;i++)
		{
			if(str.charAt(i)==' ' && i<str.length()-1 && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
System.out.println(count);
	}

}
