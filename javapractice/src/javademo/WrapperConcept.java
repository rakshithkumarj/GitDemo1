package javademo;

public class WrapperConcept {

	public static void main(String[] args) {
	String str="12345";
	/*int num=Integer.parseInt(str);
	int modifiedNum=num/10;
	String numStirng=String.valueOf(modifiedNum);
	System.out.println(numStirng);*/
	String modifiedNu=str.substring(0,3);
	System.out.println(modifiedNu);
	}

}
