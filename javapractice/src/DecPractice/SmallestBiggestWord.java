package DecPractice;

public class SmallestBiggestWord {

	public static void main(String[] args) {
		String str = "I Love My Country India";
		String[] s = str.split(" ");
		String small = s[0];
		String big = s[0];
		for (int i = 0; i <s.length; i++) {
			if (s[i].length() > big.length()) {
				big = s[i];
			} else {
				if (s[i].length() < small.length()) {
					small = s[i];
				}
			}
		}
		System.out.println("big word is=" + big);
		System.out.println("small word is=" + small);

	}

}
