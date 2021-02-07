package octpractice;

public class SumFirstLastNum {

	public static void main(String[] args) {
	int num=525;
	int sum=0;
	int lastNum=525%10;
	int firstNum=num;
	while(firstNum>10)
	{
		firstNum=firstNum/10;
		
	}
System.out.println(lastNum);
System.out.println(firstNum);
System.out.println("Sum of Number"+(firstNum+lastNum));
	}

}
