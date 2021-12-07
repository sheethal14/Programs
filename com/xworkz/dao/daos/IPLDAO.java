package com.xworkz.dao.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IPLDAO {
	Collection<String> collection=new ArrayList<String>();
	public boolean save(String teamName)
	{
		return collection.add(teamName);
		
	}
	public boolean find(String teamName) {
		return collection.contains(teamName);
	}
	public boolean findCaseInsensitive(String teamName) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			if(temp.equalsIgnoreCase(teamName)) {
				return true;
			}
		}
		return false;
	}
	public boolean findCaseInsensitiveAndTrimmed(String teamName) {
		Iterator<String> itr=collection.iterator();
		while(itr.hasNext()) {
			String temp=itr.next();
			temp=temp.replace(" ", "");
			if(temp.equalsIgnoreCase(teamName.replace(" ", ""))) {
				return true;
			}
		}
		return false;
}

}
