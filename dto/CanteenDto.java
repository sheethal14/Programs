package com.xworkz.clone.dto;

public class CanteenDto implements Cloneable{
	private String name;
	private String owner;
	private int varity;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getVarity() {
		return varity;
	}
	public void setVarity(int varity) {
		this.varity = varity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "CanteenDto [name=" + name + ", owner=" + owner + ", varity=" + varity + ", location=" + location + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
