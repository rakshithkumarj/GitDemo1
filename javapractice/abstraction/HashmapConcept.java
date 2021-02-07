package abstraction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap<String , String> hm= new HashMap<>();
		hm.put("A", "Java");
		hm.put("B", "Selenium");
		hm.put("C", "Testng");
		System.out.println(hm);
		
				
		Set<String> keySet=hm.keySet();
		for(String s:keySet)
		{
			System.out.println(s);
		}
		
	
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"::"+m.getValue());
		}
		 System.out.println("*************");
		 Set s=hm.entrySet();
		 System.out.println(s);
		 
		 System.out.println("Using Enumeration");
		 
		 
		 
		
		 
	 
     
	}

}
