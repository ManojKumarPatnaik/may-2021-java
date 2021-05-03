package com.org;

public class TestOperators {

	public static void main(String[] args) {
		double amount = 25000;
		double balance = 20000;
		if(amount <= balance) {
			System.out.println("Amount can be withdrawn");
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeds the balance");
		}
		System.out.println("Balance: "+balance);
		
	}

}
