package DecPractice;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = "Automation Engineer";
		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				s2 = s2 + str.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
