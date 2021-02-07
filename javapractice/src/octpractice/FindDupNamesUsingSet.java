package octpractice;

import java.util.HashSet;
import java.util.Set;

public class FindDupNamesUsingSet {

	public static void main(String[] args) {
	String[] names= {"Java","Selenium","Testing","Pearl","Python","Java"};
	Set<String> store= new HashSet<String>();
	for(String str:names)
	{
		if(store.add(str)==false)
		{
			System.out.println("Duplicate word is::"+str);
		}
	}
	
}}