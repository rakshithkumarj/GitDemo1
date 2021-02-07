package octpractice;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
    String[] names= {"java","Python","Pearl","Ruby","java"};
    Set<String > store= new HashSet<>();
    for(String name:names)
    {
    	if(store.add(name)==false)
    	{
    		System.out.println("Duplicate element is::"+name);
    	}  
	}

}
}