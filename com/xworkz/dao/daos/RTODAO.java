package com.xworkz.dao.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RTODAO {
	Collection<String> collection=new ArrayList<String>();
	public boolean save(String no)
	{
		return collection.add(no);
		
	}
	public boolean find(String no) {
		return collection.contains(no);
	}
	public boolean findCaseInsensitive(String no) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			if(temp.equalsIgnoreCase(no)) {
				return true;
			}
		}
		return false;
	}
	public boolean findCaseInsensitiveAndTrimmed(String no) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			temp=temp.replace(" ", "");
			if(temp.equalsIgnoreCase(no.replace(" ", ""))) {
				return true;
			}
		}
		return false;
}
}
