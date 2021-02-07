package programs;

public class CountOvals {

	public static void main(String[] args) {
		String str = "selenium";
		int count = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;

			default:
				break;
			}
		}
		System.out.println(count);
	}

}
