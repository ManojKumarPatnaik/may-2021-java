package com.org;

public class TestVariables {

	public static void main(String[] args) {
		User user1 = new User(); // user1[id = 0]
		User user2 = new User(); // user2[id = 0]
		
		user1.id = 20;
		user2.id = 30;
		
		User.counter = 1000;
		user1.counter = 2000;
		user2.counter = 3000;
		
		System.out.println("user1 id = "+user1.id+", user2 id = "+user2.id);
		System.out.println("Counter = "+User.counter); // 3000
		System.out.println("Counter = "+user1.counter); // 3000
		System.out.println("Counter = "+user2.counter); // 3000
		
	}

}
