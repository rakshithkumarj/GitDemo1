package octpractice;

public class Exception {

	public static void main(String[] args) throws ArithmeticException {
		
		int k=10/0;
		System.out.println(k);
	/*    System.out.println("throws handled the exception");*/
	    throw new ArithmeticException(" Numer cannnot be divided by 0");
		
		}
		
		
		
	}

