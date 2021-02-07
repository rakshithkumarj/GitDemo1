package Demo;

public class RemoveWhiteSpce {

	public static void main(String[] args) {
		String s = "i am an         qa engineer    ";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
