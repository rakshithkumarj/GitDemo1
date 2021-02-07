package DecPractice;

public class BiggestWord {

	public static void main(String[] args) {
		String str = "QA Automation soft";
		String[] s = str.split(" ");

		String big = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > big.length()) {

				big = s[i];
			}
			System.out.println("biggest word is =" + s[i]);

		}

	}

}
