package javasession;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class Set {

	public static void main(String[] args) {
		  
		
		java.util.Set<String> set= new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("selenium");
		set.add("testng");
		set.add("api");
		set.add("testng");
		set.add("sql");
		
		System.out.println(set);
		
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());
		}
		
		Spliterator<String> s=set.spliterator();
		
	}

}
