package abstraction;

public class HDFC extends RBI {

	@Override
	public void credit() {
		System.out.println("HDFC Credit method");
	}
		public void debit()
		{
			System.out.println("hdfc debit");
		}
		
		public void homeloan()
		{
			System.out.println("HDFC Home loan");
		}
		
		
		
		public static void main(String[] args) {
			
			HDFC hd=new HDFC();
			hd.carloan();
			hd.loan();
			hd.credit();
			hd.debit();
			
			
			RBI rb=new HDFC();
			rb.credit();
			rb.loan();
			rb.carloan();
		}
		
	}


