package com.xworkz.functionalinterface;

public class FindByCom implements Email{

	@Override
	public boolean search(String value1, String value2) {
		String sc=value1.substring(value1.length()-4,value1.length());
		if(sc.equals(value2)) {
			return true;
		}
		return false;
	}

}
