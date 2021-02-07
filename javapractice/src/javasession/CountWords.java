package javasession;

public class CountWords {

	public static void main(String[] args) {
		String s1="i am an qa automation engineer";
		String[] str=s1.split(" ");
		System.out.println(str.length);
		String s2="  i am an qa engineer    ";
		System.out.println(s2.trim());
	}

}
