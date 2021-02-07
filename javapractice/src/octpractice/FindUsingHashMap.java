package octpractice;

import java.util.HashMap;
import java.util.Iterator;

public class FindUsingHashMap {

	public static void main(String[] args) {
    String [] str= { "java","java"," pearl","python","core java"," ruby","core java","java"};
    HashMap<String, Integer> hm= new HashMap<>();
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
       Iterator<String> tempString= hm.keySet().iterator();
       while(tempString.hasNext())
       {
    	   String temp=tempString.next();
    	   if(hm.get(temp)>1)
    	   
    	   { 
    		   System.out.println("the element"+temp+ "Occureed"+hm.get(temp)+"number of times");
    	   }
       }
    }

	}


