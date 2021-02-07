package octpractice;

public class RearrangeCharacter {

	public static void main(String[] args) {
		String s= "AaBbCcDd";
		char temp;
		char[]  chars=s.toCharArray();
		System.out.println(chars);
		for(int i=0;i<chars.length;i++)
		{
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]>chars[j])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;	
				}
			}
		      System.out.print(chars[i]);
		}
  
	}

}
