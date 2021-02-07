package octpractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWord {

	public static void main(String[] args) {
	String[] str= {"selenium","java","testng","selenium","linux","sql","java","api","testng"};
	Set<String> store = new HashSet<>();
	for(String s:str)
	{
		if(store.add(s)==false)
		{
			System.out.println("duplciate word is "+s);
		}
	}

	}

}
