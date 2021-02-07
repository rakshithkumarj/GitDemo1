package javasession;

public class RevStringWords {

	public static void main(String[] args) {
		String str = "rakshith engineer qa";
		String rev = "";

		String[] s = str.split(" ");

		for (int i = s.length - 1; i >= 0; i--) {
			rev = rev + " "+s[i];
		}
		System.out.println(rev);

	}

}
