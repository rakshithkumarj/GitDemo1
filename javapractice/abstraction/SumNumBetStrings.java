package abstraction;

public class SumNumBetStrings {

	public static void main(String[] args) {
		String s1="I am25 an auto35mation engineer";
		String num="";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				num=num+s1.charAt(i);
			}
			else
			{
				if(!num.equals(""))
				{
					sum=sum+Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);
	}

}
