package Demo;

public class FindBiggestWord {

	public static void main(String[] args) {
	String words="I am an automation engineer";
	String [] str=words.split(" ");
	String big=str[0];
	String small=str[0];
	
	for(int i=0;i<str.length;i++)
	{
		if(str[i].length()>big.length())
		{
			big=str[i];
		}
		else if(str[i].length()<small.length())
		{
			small=str[i];
		}
	}
System.out.println("big "+big);
System.out.println("small "+small);
	}

}
