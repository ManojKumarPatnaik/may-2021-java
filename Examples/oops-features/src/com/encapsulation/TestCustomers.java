package com.encapsulation;

public class TestCustomers {
	public static void main(String[] args) {
		Customer customer1 = new Customer(1000, "Alex", 9988007766L);
		Customer customer2 = new Customer(2000, "Bruce", 8899771122L);
		
		System.out.println("Id = "+customer1.getCustomerId()+", Name = "+customer1.getName()+", Phone = "+customer1.getPhone());
		customer1.setName("Charles");
		System.out.println("Id = "+customer1.getCustomerId()+", Name = "+customer1.getName()+", Phone = "+customer1.getPhone());
		System.out.println("----------------------------");
		
		System.out.println("Id = "+customer2.getCustomerId()+", Name = "+customer2.getName()+", Phone = "+customer2.getPhone());
		
		System.out.println("-----------------------------");
		
	}
}
