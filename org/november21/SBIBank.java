package org.november21;

public class SBIBank implements Bank{

	@Override
	public void minimumBalance() {
		System.out.println("SBI minimum balance is 1000/-");		
	}

	@Override
	public SBIBank bankObj() {
		return new SBIBank();
	}
	
//	public SBIBank bankObj() {	//Cannot instantiate the type Bank
//		return new Bank();
//	}

	
	
}
