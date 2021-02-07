package abstraction;

public class SumFirstLastNumbers {

	public static void main(String[] args) {
		int num=525;
		int lastNum=num%10;
		int firstNum=num;
		
		while(firstNum>10)
		{
			firstNum=firstNum/10;
		}
 System.out.println(firstNum);
 System.out.println(lastNum);
 System.out.println(firstNum+lastNum);
	

}}
