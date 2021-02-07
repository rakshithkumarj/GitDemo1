package Demo;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		String rev = "";
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			rev = rev + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

}
