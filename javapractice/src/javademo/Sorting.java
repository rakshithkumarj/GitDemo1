package javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String s="AcbcaDeEd";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(char c :ch)
		{
			System.out.println(c);
		}
      

}}
