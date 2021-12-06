package com.xworkz.clone.dto;

public class BottleDto implements Cloneable{
	private String name;
	private double cost;
	private String capacity;
	private String color;
	private int noOfBottles;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfBottles() {
		return noOfBottles;
	}
	public void setNoOfBottles(int noOfBottles) {
		this.noOfBottles = noOfBottles;
	}
	@Override
	public String toString() {
		return "BottleDto [name=" + name + ", cost=" + cost + ", capacity=" + capacity + ", color=" + color
				+ ", noOfBottles=" + noOfBottles + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
