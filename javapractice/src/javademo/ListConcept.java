package javademo;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add("selenium");
		li.add("testng");
		li.add("maven");
		li.add("linux");
		li.add("api");

		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
        /* System.out.println(li.get(i));*/
			if(li.get(i).equals("selenium"))
			{
				System.out.println(i);
				li.remove(i);
			}
		}
		System.out.println(li.size());
		System.out.println(li);

	}
}
