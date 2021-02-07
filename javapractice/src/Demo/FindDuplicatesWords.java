package Demo;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicatesWords {

	public static void main(String[] args) {
		String[] str = { "java", "selenium", "java", "testng", "selenium", "linux", "sql", "api", "sql","selenium","java" };

		HashMap<String, Integer> hm = new HashMap<>();
		for (String tempString : str) 
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
			{
				hm.put(tempString, 1);
			}
		}
		
		
		Iterator<String> tempString=hm.keySet().iterator();
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the word "+temp.toUpperCase() +" repeated "+hm.get(temp)+ " number of times");
			}
		}
	}

}
