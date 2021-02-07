package octpractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		String s1="i am am an automation automation engineer";
		String s2=s1.replaceAll(" ", "");
		System.out.println(s2);
		String [] str=s1.split(" ");
		Set<String> set= new HashSet<>();
		for(String word:str)
		{
			if(set.add(word)==false)
			{
				System.out.println("duplicate element is:: "+word);
			}
		}

	}

}
