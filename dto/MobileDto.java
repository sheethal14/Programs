package com.xworkz.clone.dto;

public class MobileDto implements Cloneable{
	private String brand;
	private int price;
	private String color;
	private String modelNo;
	private int storage;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "MobileDto [brand=" + brand + ", price=" + price + ", color=" + color + ", modelNo=" + modelNo
				+ ", storage=" + storage + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoke cloneable method");
		return super.clone();
	}

}
