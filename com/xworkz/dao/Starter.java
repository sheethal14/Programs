package com.xworkz.dao;

import com.xworkz.dao.daos.GymDAO;
import com.xworkz.dao.daos.IPLDAO;
import com.xworkz.dao.daos.PGDAO;
import com.xworkz.dao.daos.RTODAO;

public class Starter {
	public static void main(String[] args) {
		RTODAO dao=new RTODAO();
		
		dao.save("KA 14 E 5678");
		dao.save("KA 16 C 7893");
		dao.save("KA 26 U 9821");
		dao.save("KA 14 G 6782");
		dao.save("KA 28 S 5690");
		
		boolean found= dao.find("KA 16 C 7893");
		System.out.println(found);
		found=dao.findCaseInsensitive("Ka 16 C 7893");
		System.out.println(found);
		found=dao.findCaseInsensitiveAndTrimmed("Ka16c7893");
		System.out.println(found);
		
		GymDAO dao1=new GymDAO();
		dao1.save("Stayfit");
		dao1.save("StayHealthy");
		dao1.save("Sweat and Fit");
		
		boolean found1=dao1.find("Sweat and Fit");
		System.out.println(found1);
		found1=dao1.findCaseInsensitive("Sweat and Fit");
		System.out.println(found1);
	    found1=dao1.findCaseInsensitiveAndTrimmed("Sweat and Fit");
	    System.out.println(found1);
	    
	    IPLDAO dao2=new IPLDAO();
	    
	    dao2.save("C S K");
	    dao2.save("M I");
	    dao2.save("R C B");
	    dao2.save("R R");
	    
	    boolean found2=dao2.find("C S K");
	    System.out.println(found2);
	    found2=dao2.findCaseInsensitive("c s k");
	    System.out.println(found2);
	    found2=dao2.findCaseInsensitiveAndTrimmed("CSk");
	    System.out.println(found2);
	    
	    PGDAO dao3=new PGDAO();
	    dao3.save("Ganesh PG");
	    dao3.save("SAI PG");
	    dao3.save("Jyothi Pg");
	    
	    boolean found3=dao3.find("Ganesh PG");
	    System.out.println(found3);
	    found3=dao3.findCaseInsensitive("ganesh pg");
	    System.out.println(found3);
	    found3=dao3.findCaseInsenstiveAndTrimmed("GaneshPG");
	    System.out.println(found3);	
	}

}
