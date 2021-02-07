package programs;

public class SumNumBetDigits {

	public static void main(String[] args) {
		String str = "i am25 an autoam50ation engin50eer";
		String num = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);
	}

}
