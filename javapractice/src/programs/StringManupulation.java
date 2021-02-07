package programs;

public class StringManupulation {

	public static void main(String[] args) {
		String str="Not found 404 error";
		System.out.println(str.replaceAll("[^aA-zZ]",""));//to remove numbers 
		
		System.out.println(str.replaceAll("[^0-9]", ""));

	}

}
