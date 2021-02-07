package programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupWords {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		String str = "i am am an software software engineer";
		String[] words=str.split(" ");
		for(String s:words)
		{
			if(!set.contains(s))
			{
				set.add(s);
			}
		}
		System.out.println(set);
		

	}

}
