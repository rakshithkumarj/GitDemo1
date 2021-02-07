package octpractice;

import java.util.HashSet;
import java.util.Set;

public class FindDupUsingSet {

	public static void main(String[] args) {
		String[] words= {"java","pearl","python","java","selenium","testng","selenium"};
	
		Set<String> set = new HashSet<>();
		for (String str : words) {
			
			if(set.add(str)==false)
			{
				System.out.println("Duplcate words are"+str);
			}
			
		}
		

	}

}
