package com.fundamentals;

public class TestEqualsHashCode {

	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Raj", 35000);
		Employee emp2 = new Employee(200, "Bruce", 45000);
		Employee emp3 = new Employee(100, "Alex", 95000);
		

		System.out.println("Equality: "+emp1.equals(emp2)); // false
		System.out.println("Equality: "+emp1.equals(emp3)); // true
		System.out.println("Equality: "+emp2.equals(emp3)); // false

		System.out.println("HashCode: "+emp1.hashCode());
		System.out.println("HashCode: "+emp2.hashCode());
		System.out.println("HashCode: "+emp3.hashCode());
	}

}
