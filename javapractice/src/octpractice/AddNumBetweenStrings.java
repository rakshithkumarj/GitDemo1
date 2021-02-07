package octpractice;

public class AddNumBetweenStrings {

	public static void main(String[] args) {
		String s1 =   "Ia m55a n auto55  mation engi  neer";
		String num="";
		int sum=0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				num =num+s1.charAt(i);

			} else {
				if (!num.equals("")) {
					sum = sum+Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);
	}

}
