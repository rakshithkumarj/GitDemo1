package Demo;

public class Space {

	public static void main(String[] args) {
		String s1 = "evergreen6435786384576832forest";
		StringBuffer sb = new StringBuffer(s1);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) < 48 || sb.charAt(i) > 57) {
				sb.deleteCharAt(i);
				i--;
			}
		}

		System.out.println(sb);
	}

}
