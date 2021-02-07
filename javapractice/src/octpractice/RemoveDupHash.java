package octpractice;

import java.util.HashMap;
import java.util.Iterator;

public class RemoveDupHash {
	
	 static void removeDuplicates(String str)
	 {
		 HashMap<String , Integer> hm= new HashMap<>();
		 String []s=str.split(" ");
		 for(String tempString:s)
		 {
			 if(hm.get(tempString)!=null)
			 {
				 hm.put(tempString,hm.get(tempString)+1 );
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
				System.out.println(" The duplicate element is "+temp+" appered "+hm.get(temp)+ "  number of times ");
			}
		}
	 }
	
	
	

	public static void main(String[] args) {
		removeDuplicates("I am am am learning java java");

	}

}
