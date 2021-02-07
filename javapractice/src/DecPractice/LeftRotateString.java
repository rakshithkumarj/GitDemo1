package DecPractice;

public class LeftRotateString {

	public static void main(String[] args) {
		String str = "Selenium";
		char[] ch = str.toCharArray();
		char temp = ch[0];

		for (int i = 1; i < ch.length; i++) {
			ch[i - 1] = ch[i];
		}
		ch[ch.length - 1] = temp;
		for (char c : ch) {
			System.out.println(c);
		}

	}

}
