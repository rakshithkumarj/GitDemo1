package Demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
	String s1="selenium";
	char[] ch=s1.toCharArray();
	Set<Character> set= new HashSet<>();
	StringBuffer sf= new StringBuffer();
	for(Character c:ch)
	{
		if(set.add(c)==true)
		{
			set.add(c);sf.append(c);
		}
	}
System.out.println(sf);
	}

}
