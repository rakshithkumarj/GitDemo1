package octpractice;

import java.util.HashMap;
import java.util.Iterator;

public class FindDupHashMap {

	public static void main(String[] args) {
		String [] str= {"java","python","java","ruby","pearl","ruby","java"};
		HashMap<String , Integer> hm= new HashMap<>();
		for(String tempString:str)
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
				 System.out.println("the element" + temp+ "Occured" + hm.get(temp) + "number of times");
			 }
		}
}}
