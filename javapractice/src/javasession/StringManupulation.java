package javasession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringManupulation {

	public static void main(String[] args) {
		String s1 = "Evergreen";
		HashMap<Character, Integer> hm= new HashMap<>();
		char[] ch = s1.toCharArray();
		for (char c : ch) 
		{
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
			
			
		
			
			System.out.println(hm);
		}
		
	}


