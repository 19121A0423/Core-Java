package org.november20;

public interface Exceptions {
	
	void program1() throws Exception;
	
	void checkingPassword(String epassword);
	
	void checkingBalance(int balance) throws MinimumBalance ;
	
	void withdrawATM(int amount,int epin);
	
	void calculateMethod();
	
	void withdrawBank(int amount);
	
	void eligibleForVoteOrNot(int age,boolean voterId) throws NotEligible;
	
}
