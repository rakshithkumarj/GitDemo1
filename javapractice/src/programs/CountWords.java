package programs;

public class CountWords {

	public static void main(String[] args) {
		String str = "i am an an automation engineer";
		/*
		 * String[] s=str.split(" "); System.out.println(s.length)
		 */;
		int count = 1;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' && i<str.length()-1)
		{
			count++;
		}

	}
		System.out.println(count);
}
}