package Demo;

public class RevWordsBuffer {

	public static void main(String[] args) {
		String str = "welcome to qa talks";
		String revWords = "";
		String[] words = str.split(" ");
		for (String word : words) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			revWords = revWords + sb.toString() + " ";

		}
		System.out.println(revWords);
	}

}
