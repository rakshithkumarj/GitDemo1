package octpractice;

public class HDFC extends RBI {

	
	public void credit()
	{
		System.out.println("HDFC Credit");
	}
	
	public void Homeloan()
	{
		System.out.println("HDFC homeloan");
	}
	
	public void Mutualfund()
	{
		System.out.println("HDFC mutual funds");
	}
	
	
	public static void main(String[] args) {
		
		//when same method present in child and Parent class ,Java complier will give importance to the child class methods is called compile time polymerphisim
		HDFC hd = new HDFC();
		hd.credit();
		hd.debit();
		hd.Mutualfund();
		
		
		//upcasting also called as runtime polymerphism;

		RBI rb=new HDFC();
		rb.credit();
		rb.debit();
		
		
		
		
	}
}
