package com.springcore.collections;
import java.util.*;

public class Emp 
{
	public Emp() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses,Properties channel) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.channel=channel;
	}
	private String name;
	private List<String>phones;
	private Set<String>address;
	private Map<String,String>courses;
	private Properties channel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getChannel() {
		return channel;
	}
	public void setChannel(Properties channel) {
		this.channel = channel;
	}
}
