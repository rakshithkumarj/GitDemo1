package logics;

public class TestBank {

	public static void main(String[] args) {
		
	//Compile time polymorphism -when common method (Credit()) present in the parent and child class ,Java compiler will give importance to the child class method 
	//
	HDFCBank bank = new HDFCBank();
	bank.credit();
	bank.debit();
	bank.educationloan();
	
		

	//Run time polymorphism-child class object is refferred by Parent class/Interface refernce variable ,So that we can call the its own methods as well as overridden methods in the child class can be called.it is also called as an Up
	RBIBank rbi=new HDFCBank();
	rbi.credit();
	rbi.debit();
	rbi.carLoan();
	rbi.loan();
	

	}

}
