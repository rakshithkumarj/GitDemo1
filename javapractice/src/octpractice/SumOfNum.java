package octpractice;

public class SumOfNum {

	public static void main(String[] args) {
		String str = "Sele25nium25automaiton engineer";
		int sum = 0;
		String num = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum+Integer.parseInt(num);
					num ="";
				}

			}

		}
		 System.out.println(sum);
	}

}
