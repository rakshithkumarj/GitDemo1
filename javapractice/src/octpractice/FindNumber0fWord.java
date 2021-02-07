package octpractice;

public class FindNumber0fWord {

	public static void main(String[] args) {
	String str="rakshith kumar   J";
    System.out.println(str.split("\\s+").length);
	int count =1;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ' && i<str.length()-1 && str.charAt(i+1)!=' ')
		{
			count++;
		}
		
	}
	System.out.println(count);
	}

}
