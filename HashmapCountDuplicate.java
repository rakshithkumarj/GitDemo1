package practice;

import java.util.HashMap;

public class HashmapCountDuplicate {

	public static void main(String[] args) {
		String[] str= {"java","selenium","testng","linux","java","testng"};
		
		HashMap<String, Integer> hm= new HashMap<String,Integer>();
		for(String tempString:str)
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else	
				
			{
				hm.put(tempString,1);
			}
			
		}
			System.out.println(hm);	
              
	}

}
