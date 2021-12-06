package com.xworkz.clone.dto;

public class HospitalDto implements Cloneable{
	private String name;
	private String location;
	private int noOfWards;
	private int totalPatients;
	private boolean doctorsAvailable;
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
	public int getNoOfWards() {
		return noOfWards;
	}
	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}
	public int getTotalPatients() {
		return totalPatients;
	}
	public void setTotalPatients(int totalPatients) {
		this.totalPatients = totalPatients;
	}
	public boolean isDoctorsAvailable() {
		return doctorsAvailable;
	}
	public void setDoctorsAvailable(boolean doctorsAvailable) {
		this.doctorsAvailable = doctorsAvailable;
	}
	@Override
	public String toString() {
		return "HospitalDto [name=" + name + ", location=" + location + ", noOfWards=" + noOfWards + ", totalPatients="
				+ totalPatients + ", doctorsAvailable=" + doctorsAvailable + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
