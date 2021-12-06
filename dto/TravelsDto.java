package com.xworkz.clone.dto;

public class TravelsDto implements Cloneable{
	private String name;
	private String owner;
	private long contactNo;
	private int noOfVehicles;
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
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public int getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	@Override
	public String toString() {
		return "TravelsDto [name=" + name + ", owner=" + owner + ", contactNo=" + contactNo + ", noOfVehicles="
				+ noOfVehicles + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
