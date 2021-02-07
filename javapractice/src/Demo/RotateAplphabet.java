package Demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RotateAplphabet {

	public static void main(String[] args) {
	String str="selenium";
	String[] inputArray=str.split("");
	String[] alphabets="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
	
	//creating hashset
	Set<String> s1= new HashSet<>(Arrays.asList(inputArray));
	Set<String> s2= new HashSet<>(Arrays.asList(alphabets));
	System.out.println(s2.removeAll(s1));
	System.out.println(s2);
	
		
	

}}
