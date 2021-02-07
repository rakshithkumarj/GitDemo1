package javasession;

public class RemoveDigit {

	public static void main(String[] args) {
	String str= "server not found 404 error";
	System.out.println(str.replaceAll("[^A-Za-z]", "").trim());

	}

}
