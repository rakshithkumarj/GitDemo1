package javasession;

public class PrintOvals {

	public static void main(String[] args) {
		String str = "beautiful";
		char[] ch = str.toCharArray();
		int count = 0;
		for (char c : ch) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				System.out.println(c);
				count++;

			default:
				break;

			}

		}
		System.out.println(count);
	}

}
