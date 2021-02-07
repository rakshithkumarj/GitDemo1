package programs;

import java.util.Arrays;

public class AlternateUppecase {

	public static void main(String[] args) {

		String html = "This is bold";
		 html = html.replaceAll("[^a-zA-Z0-9\\s+]", ""); 
		 System.out.println(html);
}
}