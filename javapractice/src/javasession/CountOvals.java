package javasession;

public class CountOvals {

	public static void main(String[] args) {
		String s1="umbrellai";
		int count=0;
		char[] ch=s1.toCharArray();
		for(char c:ch)
		{
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
			count++;	

			default:
				break;
			}
		}
		
System.out.println(count);
	}

}
