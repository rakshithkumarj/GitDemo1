package abstraction;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
	String name="selenium";
	Set<Character> set = new HashSet<Character>();
	 StringBuffer sb= new StringBuffer();
	 for(int i=0;i<name.length();i++)
	 {
		 Character c=name.charAt(i);
		 if(!set.contains(c))
		 {
			 set.add(c);
			 sb.append(c);
		 }
	 }
System.out.println(sb);
	}

}
