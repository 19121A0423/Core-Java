package org.november16;

import java.util.Random;

public class GenerateOTP {

	public static void main(String[] args) {
		Random random=new Random();
		String otp="";
		for(int index=0;index<4;index++) {
			otp=otp+random.nextInt(9);
		}
		System.out.println(otp);
		
	}

}
