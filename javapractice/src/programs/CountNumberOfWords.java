package programs;

import java.util.HashMap;
import java.util.Iterator;

public class CountNumberOfWords {

	public static void main(String[] args) {
		String[] words = { "java", "pearl", "python", "selenium", "testng", "java", "selenium" };
		HashMap<String, Integer> hm = new HashMap<>();
		for (String word : words) {
			if (hm.get(word) != null) {
				hm.put(word, hm.get(word) + 1);
			}

			else

			{
				hm.put(word, 1);
			}
		
		}
		
		/*System.out.println(hm);*/
		Iterator<String> temp=hm.keySet().iterator();
		while(temp.hasNext())
		{
			String word=temp.next();
			if(hm.get(word)>1)
			{
				System.out.println("the word"+word+ "Occurred"+hm.get(word)+ "number of times");
			}
		}
	}
}
