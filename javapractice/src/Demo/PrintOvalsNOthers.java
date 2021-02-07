package Demo;

public class PrintOvalsNOthers {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				StringBuffer sb= new StringBuffer(c);
				System.out.println(sb.append(c));
				
			} else {
				System.out.println("");
			}
			
		}
	}

}
