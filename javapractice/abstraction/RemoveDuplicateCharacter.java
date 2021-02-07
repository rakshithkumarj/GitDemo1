package abstraction;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str="automation";
		StringBuffer sf= new StringBuffer();
		Set<Character> set= new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
				
			}
		}
System.out.println(sf);
	}

}
