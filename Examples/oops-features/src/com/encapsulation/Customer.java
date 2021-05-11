package com.encapsulation;

public class Customer {
	private int customerId;
	private String name;
	private long phone;
	
	public Customer(int customerId, String name, long phone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
}
