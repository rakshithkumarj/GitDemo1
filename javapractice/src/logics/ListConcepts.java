package logics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) {
		//collection is hetrogenious in nature we can store varios data types(byte,short,int,ong,float,double,character,boolean)
		//list store the values in the form of indexes
		//list preserve the insertion order
		//list we have add method to store and get method to retrive the data
		//it allows duplicate and null values 
		
		List li= new ArrayList();
		li.add("java");
		li.add("selenium");
		li.add("linux");
		li.add("testng");
		li.add("api");
		li.add("java");
		li.add(null);
		
		
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).equals("api"))
			{
				System.out.println(i);
				break;//break is added to avoid the null pointer exception
			}
		}
		
		Iterator it=li.iterator();//fetching the list values using the iterator 
		{
			System.out.println(it.next());
		}
		
		
		
		

	}

}
