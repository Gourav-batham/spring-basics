package com.springcore.lifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPrice(int price) {
		System.out.println("Setting price of samosa");
		this.price = price;
	}
	public void init()
	{
		System.out.println("Inside init method of samosa");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method of samosa");
	}

	@Override
	public String toString() {
		return "Samosa [Price=" + price + "]";
	}
}
