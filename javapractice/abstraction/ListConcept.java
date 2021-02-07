package abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
	List li = new ArrayList();
	li.add("java");
	li.add(1);
	li.add('r');
	li.add(9.5);
	li.add(10);
	li.add(true);
	li.removeAll(li);
	
	
	System.out.println(li);
	
	//Using for loop
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i));
	}
	
	Iterator it=li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

}
