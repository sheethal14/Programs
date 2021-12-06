package com.xworkz.clone.dto;

public class MallsDto implements Cloneable{
	private String name;
	private String location;
	private int totalGates;
	private int noOfShops;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotalGates() {
		return totalGates;
	}
	public void setTotalGates(int totalGates) {
		this.totalGates = totalGates;
	}
	public int getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}
	@Override
	public String toString() {
		return "MallsDto [name=" + name + ", location=" + location + ", totalGates=" + totalGates + ", noOfShops="
				+ noOfShops + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
