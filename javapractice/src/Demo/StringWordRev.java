package Demo;

public class StringWordRev {

	public static void main(String[] args) {
		String str = "qa automation engineer";
		String[] s = str.split(" ");
		String rev = "";
		for (int i = s.length - 1; i >= 0; i--) {
			rev = rev+" "+ s[i];
		}
		System.out.println(rev);
	}

}
