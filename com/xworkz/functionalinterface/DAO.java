package com.xworkz.functionalinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DAO {
	Collection<String> collection=new ArrayList<String>();
	public boolean save(String id) {
		return collection.add(id);
	}
	public boolean find(Email email, String value) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(email.search(temp,value))
			{
				return true;
			}	
		}
		return false;
	}
	
}