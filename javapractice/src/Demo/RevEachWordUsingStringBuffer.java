package Demo;

public class RevEachWordUsingStringBuffer {

	public static void main(String[] args) {
		String str = "welcome to java";
		String[] words = str.split("//s");
		String revwords = "";
		for (String word : words) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();

			revwords = revwords + sb.toString() + " ";
		}
		System.out.println(revwords);

	}

}
