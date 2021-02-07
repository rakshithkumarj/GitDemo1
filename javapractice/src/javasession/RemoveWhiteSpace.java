package javasession;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s1 = "Automation qa Engineer";
		String str = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				str = str + s1.charAt(i);
			}
		}
		System.out.println(str);
		System.out.println("using regex");
		System.out.println(s1.replaceAll(" ", ""));

	}

}
