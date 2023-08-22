package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//property set karne ke baad ye method chalega,therefore ye method init() method ka kaam krega
		//in logo ne naam badal diya hai init() ka 
		System.out.println("taking pepsi: init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottle back to shop:destroy of pepsi");
	}
}
