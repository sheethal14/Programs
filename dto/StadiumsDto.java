package com.xworkz.clone.dto;

public class StadiumsDto implements Cloneable{
	private String name;
	private int capacity;
	private String type;
	private String location;
	private double feePerPerson;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getFeePerPerson() {
		return feePerPerson;
	}
	public void setFeePerPerson(double feePerPerson) {
		this.feePerPerson = feePerPerson;
	}
	@Override
	public String toString() {
		return "StadiumsDto [name=" + name + ", capacity=" + capacity + ", type=" + type + ", location=" + location
				+ ", feePerPerson=" + feePerPerson + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
