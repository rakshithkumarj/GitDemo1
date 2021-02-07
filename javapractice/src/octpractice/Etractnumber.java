package octpractice;

public class Etractnumber {

	public static void main(String[] args) {
    String s1="Server error 404 occured";
    String s2=s1.replaceAll("[^0-9]", "");
    System.out.println(s2.trim());
   /*System.out.println( s1.replaceAll("\\D+", ""));*/
   
   

	}

}
