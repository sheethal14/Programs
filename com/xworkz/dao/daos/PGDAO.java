package com.xworkz.dao.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PGDAO {
	Collection<String> collection =new ArrayList<String>();
	public boolean save(String p)
	{
		return collection.add(p);
		
	}
	public boolean find(String p) {
		return collection.contains(p);
	}
	public boolean findCaseInsensitive(String p) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			if(temp.equalsIgnoreCase(p)) {
				return true;
			}
		}
		return false;
	}
	public boolean findCaseInsenstiveAndTrimmed(String p) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			temp=temp.replace(" ", "");
			if(temp.equalsIgnoreCase(p.replace(" ", ""))) {
				return true;
			}
		}
		return false;
	}

}
