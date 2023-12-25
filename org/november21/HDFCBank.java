package org.november21;

public class HDFCBank implements Bank{

	@Override
	public void minimumBalance() {
		System.out.println("HDFC minimum balance is 5000/-");
	}

	@Override
	public Bank bankObj() {
		return new HDFCBank();
	}

}
