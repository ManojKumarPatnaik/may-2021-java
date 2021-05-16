package com.fundamentals;

public class TestWrapperClass {

	public static void main(String[] args) {
		String amount = "15000.0";
		String balance = "25000.0";
		
		
		double amountDouble = Double.parseDouble(amount);
		double balanceDouble = Double.parseDouble(balance);
		balanceDouble = amountDouble + balanceDouble;
		System.out.println("Balance: "+balanceDouble);
		
		// converting int to binary value
		int intValue = 5; 
		System.out.println("Binary of 5: "+Integer.toBinaryString(intValue));
		
	}

}

/*
 	Amount : 10000     =====> read that 10000  =====> destination account
 */
