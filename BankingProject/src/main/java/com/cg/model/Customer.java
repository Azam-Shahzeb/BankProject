package com.cg.model;

public class Customer {

	private String Name;
	private int CustomerId;
	private Address address;
	public Customer(String name, int customerId, Address address) {
		super();
		this.Name = name;
		this.CustomerId = customerId;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address2) {
		address2 = address2;
	}
	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", CustomerId=" + CustomerId + ", Address=" + address + "]";
	}
	
	
	
	
}
