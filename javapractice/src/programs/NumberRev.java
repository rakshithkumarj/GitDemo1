package programs;

public class NumberRev {

	public static void main(String[] args) {
		int rem = 0;
		String rev = "";
		int num = 12345;

		while (num > 0) {
			rem = num % 10;
			rev = rev + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
