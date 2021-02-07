package octpractice;

import java.util.HashSet;
import java.util.Set;

public class DemoRemoveDupCha {

	public static void main(String[] args) {
		String str="I am an automation engineer";
		System.out.println(removeDup(str));
	}
	
	
	public static String removeDup(String str)
	{
		Set<Character> set= new HashSet<>();
		StringBuffer sf= new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
				
			}
		}
 
		
		return sf.toString();
		

	}

}
