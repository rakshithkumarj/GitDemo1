package octpractice;

import java.util.HashMap;
import java.util.Iterator;

public class FindNumberOfDuplicateCharacter {

	public static void main(String[] args) {
		String s="I am an software engineer";
		String str=s.replaceAll(" ", "");
		char[] chars=str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(char ch:chars)
		{
			if(hm.get(ch)!=null)
			{
				hm.put(ch, hm.get(ch)+1);
			}
		
		else
			
		{
			hm.put(ch, 1);
			
		}
		
	}
		Iterator<Character> ch=hm.keySet().iterator();
		while(ch.hasNext())
		{
			Character c=ch.next();
			if(hm.get(c)>1)
			{
				System.out.println("Character" +c+ "Occured"+ hm.get(c)+ "Number of times");
			}
		}
}}