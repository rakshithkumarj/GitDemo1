package octpractice;

public class ArrayConcept {

	public static void main(String[] args) {
 
	int num=545;
	int lastNum=num%10;
	int firstNum=num;
	int sum=0;
	
	while(firstNum>10)
	{
		firstNum=firstNum/10;
	}
	
	System.out.println(lastNum);
	System.out.println(firstNum);
	System.out.println(firstNum+lastNum);
}}