package com.springcore.auto.wire;

public class Emp {
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor injection");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setter injection");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
