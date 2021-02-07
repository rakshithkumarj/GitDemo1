package Demo;

public class StringRevWords {

	public static void main(String[] args) {
		String str = "Evergreen forest";
		String rev = "";
		String[] s = str.split(" ");
		for (int i = s.length - 1; i >= 0; i--)

		{
			rev = rev+ " " + s[i];
		}
		System.out.println(rev);
	}

}
