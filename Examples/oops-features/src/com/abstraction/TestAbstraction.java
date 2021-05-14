package com.abstraction;

abstract class Bike implements Vehicle {
	public void wheels() {
		System.out.println("Bike has 2 wheels");
	}
}
class Pulsar extends Bike {
	public void mileage() {
		System.out.println("Pulsar gives 40kmpl");
	}
}
class RoyalEnfield extends Bike {
	public void mileage() {
		System.out.println("RoyalEnfield gives 30kmpl");
	}
}

public class TestAbstraction {
	public static void main(String[] args) {
		Vehicle v;
		Pulsar p = new Pulsar();
		RoyalEnfield r = new RoyalEnfield();
		v = p;
		v.mileage(); // pulsar mileage
		v.wheels(); // pulsar wheels
		v = r;
		v.mileage(); // royal enfield mileage
		v.wheels(); // royal enfield wheels
	}
}
