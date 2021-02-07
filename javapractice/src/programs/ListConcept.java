package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add("selenium");
		li.add("testng");
		li.add("linux");
		li.add("java");
		
		System.out.println(li);
		Iterator<String> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).equals("testng"))
			{
			System.out.println(i);
			
		}

	}}}


