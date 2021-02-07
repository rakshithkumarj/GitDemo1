package octpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
	List<String> li1 = new ArrayList<>();
	li1.add("java");
	li1.add("selenium");
	li1.add("testng");
	li1.add("sql");
	li1.add("api");
	
	
	List<String> li2 = new ArrayList<>();
	li2.add("java");
	li2.add("selenium");
	li2.add("testng");
	li2.add("sql");

	System.out.println(li1.retainAll(li2));
	
		

	}

}
