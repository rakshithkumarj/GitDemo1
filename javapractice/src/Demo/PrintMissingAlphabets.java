package Demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintMissingAlphabets {

	public static void main(String[] args) {
		String s="Automation";
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			result=result+s.charAt(i);
			System.out.println(result);
		}
		
	}

}
