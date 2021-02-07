package Demo;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "welcome to java";
		String[] words = str.split(" ");
		String revWords = "";

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
