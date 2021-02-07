package DecPractice;

public class StringPattern {

	public static void main(String[] args) {
		String str = "Automation";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i);
			System.out.println(result);
		}

	}

}
