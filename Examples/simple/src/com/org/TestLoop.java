package com.org;

public class TestLoop {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("-------------");
		int counter = 10;   // 0
		while(counter > 0) {   // 0 > 0
			System.out.println("Counter: "+counter); 
			counter--; 
		}
		System.out.println("--------------");
		counter = 10;
		do {
			System.out.println("Do-while counter: "+counter);
			counter--;
		} while(counter > 0); 
	}

}
