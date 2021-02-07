package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingAlphabet {

	public static void main(String[] args) {
		String s="selenium";
		String [] str=s.split("");
		String[] allAlphabets="abcdefghijklnmopqrstuvwxyz".split("");
		
		List<String> s1=new ArrayList<>(Arrays.asList(str));
		List<String> s2=new ArrayList<>(Arrays.asList(allAlphabets));
		s2.removeAll(s1);
		System.out.println(s2);
		
	}

}
