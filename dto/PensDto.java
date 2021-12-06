package com.xworkz.clone.dto;

public class PensDto implements Cloneable{
	private String name;
	private int cost;
	private String type;
	private String color;
	private int noOfPens;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfPens() {
		return noOfPens;
	}
	public void setNoOfPens(int noOfPens) {
		this.noOfPens = noOfPens;
	}
	@Override
	public String toString() {
		return "PensDto [name=" + name + ", cost=" + cost + ", type=" + type + ", color=" + color + ", noOfPens="
				+ noOfPens + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
