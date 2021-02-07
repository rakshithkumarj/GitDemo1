package javasession;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		String s1="abaccpqrsbcdab";
		
		char[] ch=s1.toCharArray();
		HashMap<Character, Integer> hm= new HashMap<>();
		for(char c:ch)
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
