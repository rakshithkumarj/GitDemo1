package octpractice;

public class DemoUppercase {

	public static void main(String[] args) {
		String str = "i am an qa automation engineer";
		StringBuffer sf = new StringBuffer();
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++)

		{
			System.out.println(s[i]);
			sf.append(Character.toUpperCase(s[i].charAt(0))).append(s[i].substring(1)).append(" ");
		}
		System.out.println(sf);
	}

}
