package DecPractice;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "auto9743mation777qa637";
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) < 48 || sb.charAt(i) > 57) {
				sb.deleteCharAt(i);
				i--;

			}
		}
		System.out.println(sb);
	}

}
