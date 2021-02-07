package abstraction;

public class FactorialNumber {

	public static void main(String[] args) {

    int fact=1;
    int num=4;
    for(int i=2;i<=num;i++)
    {
    	fact=fact*i;
    }
    System.out.println(fact);
	}

}
