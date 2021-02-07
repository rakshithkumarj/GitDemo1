package octpractice;

public class RemoveDigitsInString {

	public static void main(String[] args) {
		String s1="Internal Server 500 error";
		System.out.println(s1.replaceAll("[^0-9]", "").trim());
System.out.println(s1.replaceAll("\\D+", ""));
	}

}
