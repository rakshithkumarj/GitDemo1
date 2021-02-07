package programs;

public class ToUpperUpperCase {

	public static void main(String[] args) {

		String str = "i am an automation engineer";
		StringBuffer sf = new StringBuffer();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			sf.append(Character.toUpperCase(s[i].charAt(0))).append(s[i].substring(1)).append(" ");
		}
		System.out.println(sf);
	}

}
