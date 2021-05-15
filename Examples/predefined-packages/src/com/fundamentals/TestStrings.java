package com.fundamentals;

public class TestStrings {
	public static void main(String[] args) {
		String name = "Alexandar";
		System.out.println("Name = "+name);
		System.out.println("Character at 5th index = "+name.charAt(5)); // n
		System.out.println("Length: "+name.length());
		System.out.println("Uppercase: "+name.toUpperCase()); // ALEXANDAR
		System.out.println("Name = "+name); // Alexandar
		String password = "alex";
		System.out.println("Comparision: "+password.equals("alex123")); // false
		System.out.println("Comparision: "+password.equals("alex")); // true
		System.out.println("Comparision: "+password.equals("ALEX")); // false
		System.out.println("Comparision: "+password.equalsIgnoreCase("ALEX")); // true
	}
}
