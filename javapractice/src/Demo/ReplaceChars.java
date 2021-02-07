package Demo;

public class ReplaceChars {

	public static void main(String[] args) {
		String str = "Selenium";
		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'n') {
				s2 = s2 + str.charAt(i);
			}

		}
		System.out.println(s2);

	}

}
