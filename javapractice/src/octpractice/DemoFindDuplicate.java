package octpractice;

import java.util.HashSet;
import java.util.Set;

public class DemoFindDuplicate {

	public static void main(String[] args) {
		String[] names= {"rakshith","Kartik","Rakshith","Rakshi","Rakhith kumar J"};
		Set<String> store= new HashSet<String>();	
		    for(String name:names)
		    {
		    	if(store.add(name)==false)
		    	{
		    		System.out.println("Duplicate element is::" +name);
		    	}
		    	
		    }
		}

	}


