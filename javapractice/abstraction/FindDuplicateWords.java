package abstraction;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		String[] words= {"java","pyhton","java","c++","pearl","ruby"};
		Set<String> store= new HashSet<String>();
		for (String s : words) {
			
			if(store.add(s)==false)
			{
				System.out.println("Duplicate word is "+s);
			}
			
		}
		
				
		}

	}


