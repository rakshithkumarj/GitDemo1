package practice;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("java");
		list.add("selenium");
		list.add("testng");
		list.add("linux");
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals("testng"))
			{
			System.out.println(i);
		}
		}}}


