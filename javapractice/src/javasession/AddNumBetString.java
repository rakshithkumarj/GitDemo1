package javasession;

public class AddNumBetString {

	public static void main(String[] args) {
		String s1 = "qa25 automation50selenium engineer";
		String num = "";
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				num = num + s1.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum +Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);
	}

}
