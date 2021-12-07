package com.xworkz.dao.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {
	Collection<String> collection=new ArrayList<String>();
	public boolean save(String name)
	{
		return collection.add(name);
		
	}
	public boolean find(String name) {
		return collection.contains(name);
	}
	public boolean findCaseInsensitive(String name) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			if(temp.equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	public boolean findCaseInsensitiveAndTrimmed(String name) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			temp=temp.replace(" ", "");
			if(temp.equalsIgnoreCase(name.replace(" ", ""))) {
				return true;
			}
		}
		return false;
}

}
