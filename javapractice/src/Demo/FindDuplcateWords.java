package Demo;

import java.util.HashSet;
import java.util.Set;

public class FindDuplcateWords {

	public static void main(String[] args) {
		String str="i am am an engineer software software engineer";
		String[] words=str.split(" ");
		
		Set<String> set= new HashSet<>();
		for(String s:words)
		{
			if(set.add(s)!=false)
			{
				System.out.println(s);
			}
		}

	}

}
