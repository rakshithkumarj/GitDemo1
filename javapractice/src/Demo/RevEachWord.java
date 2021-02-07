package Demo;

public class RevEachWord {

	public static void main(String[] args) {
		String str = "welcome to automation";
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
		String[] rWords = revWords.split("");
		String ReveWord = "";
		for (int i = rWords.length - 1; i >= 0; i--) {
			ReveWord = ReveWord + rWords[i];
		}
		System.out.println(ReveWord);

	}

}
