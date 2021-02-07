package Demo;

public class ReversEachWord {

	public static void main(String[] args) {
		String str = "welcome to qa talks";
		String revWords = "";
		String[] words = str.split(" ");
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revWords = revWords + revWord + " ";
		}

		System.out.println(revWords);
	}

}
