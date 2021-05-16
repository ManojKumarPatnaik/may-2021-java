package com.utility;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter a string");
		String name = scan.next();
		System.out.println("Enter a double");
		double salary = scan.nextDouble();
		System.out.println("Num: "+num+", Name: "+name+", Salary: "+salary);
	}

}
