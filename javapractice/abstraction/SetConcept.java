package abstraction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetConcept {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("selenium");
		set.add("testng");
		set.add("maven");
		
		System.out.println(set);
		
		//In set we can fetch data using an iterator
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***********");
		for(String s:set)
		{
			
			System.out.println(s);
		}
		
		
		

		
	}

}
