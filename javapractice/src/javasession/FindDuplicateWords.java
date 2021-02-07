package javasession;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		 String s1="i am am an software engineer software";
		 String[] str=s1.split(" ");
		 for(String s:str)
		 {
			 if(set.add(s)==true)
			 {
				 System.out.println("duplciate word is"+s);
			 }
		 }


	}

}
