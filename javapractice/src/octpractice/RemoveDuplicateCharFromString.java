package octpractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		String s1="Rakshith";
		Set<Character> set= new HashSet<Character>();
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			Character c=s1.charAt(i);
			if(!set.contains(c))
			{
			 set.add(c);
			 sb.append(c);
			 
			}
		}
 System.out.println(sb);
	}

}
