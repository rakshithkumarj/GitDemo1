package octpractice;

public class AddNum {

	public static void main(String[] args) {
		String str = "i am45 an soft55ware engineer";
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
