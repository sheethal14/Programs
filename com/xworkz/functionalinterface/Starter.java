package com.xworkz.functionalinterface;

public class Starter {
	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.save("sheethalbm1999@gmail.com");
		dao.save("preethamkr36@gmail.com");
		dao.save("sheethalgowdabm.xworkz@gmail.com");
		
		Email email=new FindByEmail();
		boolean found=dao.find(email, "preethamkr36@gmail.com");
		System.out.println(found);
		
		Email email1=new FindByCom();
		boolean found1=dao.find(email1, ".com");
		System.out.println(found1);
		
		Email email2=new FindByIn();
		boolean found2=dao.find(email2, ".in");
		System.out.println(found2);
	}

}
