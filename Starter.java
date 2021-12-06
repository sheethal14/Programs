package com.xworkz.clone;

import com.xworkz.clone.dto.BottleDto;
import com.xworkz.clone.dto.CanteenDto;
import com.xworkz.clone.dto.HospitalDto;
import com.xworkz.clone.dto.InstituteDto;
import com.xworkz.clone.dto.LaptopDto;
import com.xworkz.clone.dto.MallsDto;
import com.xworkz.clone.dto.MobileDto;
import com.xworkz.clone.dto.PensDto;
import com.xworkz.clone.dto.ShowroomDto;
import com.xworkz.clone.dto.StadiumsDto;
import com.xworkz.clone.dto.TravelsDto;

public class Starter {
	public static void main(String[] args) throws CloneNotSupportedException {
		MobileDto md=new MobileDto();
		md.setBrand("Samsung");
		md.setColor("White");
		md.setModelNo("45asdf65");
		md.setStorage(60);
		md.setPrice(50000);
		
		MobileDto md1=(MobileDto)md.clone();
		System.out.println(md1);
		
		LaptopDto ld=new LaptopDto();
		ld.setName("Dell");
		ld.setRam("8Gb");
		ld.setPrice(700000);
		ld.setGeneration(10);
		ld.setDisplay("15.6 full hd");
		
		LaptopDto ld1=(LaptopDto)ld.clone();
		System.out.println(ld1);
		
		BottleDto bd=new BottleDto();
		bd.setName("Tapperware");
		bd.setCost(350.00);
		bd.setColor("Purple");
		bd.setCapacity("1 litre");
		bd.setNoOfBottles(25);
		
		BottleDto bd1=(BottleDto)bd.clone();
		System.out.println(bd1);
		
		StadiumsDto sd=new StadiumsDto();
		sd.setName("Nehru Stadium");
		sd.setCapacity(700);
		sd.setType("Indoor and Outdoor");
		sd.setLocation("Shimoga");
		sd.setFeePerPerson(50.00);
		
		StadiumsDto sd1=(StadiumsDto)sd.clone();
		System.out.println(sd1);
		
		InstituteDto id=new InstituteDto();
		id.setName("JNNCE");
		id.setLocation("Shimoga");
		id.setNoOfBranches(5);
		id.setTotalStudents(1500);
		id.setType("Private");
		
		InstituteDto id1=(InstituteDto)id.clone();
		System.out.println(id1);
		
		PensDto pd=new PensDto();
		pd.setName("Rynolds");
		pd.setColor("Blue");
		pd.setCost(50);
		pd.setNoOfPens(25);
		pd.setType("Gliter");
		
		PensDto pd1=(PensDto)pd.clone();
		System.out.println(pd1);
		
		HospitalDto hd=new HospitalDto();
		hd.setName("Meghan Hospital");
		hd.setLocation("Shimoga");
		hd.setNoOfWards(68);
		hd.setTotalPatients(500);
		hd.setDoctorsAvailable(true);
		
		HospitalDto hd1=(HospitalDto)hd.clone();
		System.out.println(hd1);
		
		MallsDto mld=new MallsDto();
		mld.setName("Orion");
		mld.setLocation("Banglore");
		mld.setNoOfShops(46);
		mld.setTotalGates(6);
		
		MallsDto mld1=(MallsDto)mld.clone();
		System.out.println(mld1);
		
		ShowroomDto srd=new ShowroomDto();
		srd.setName("Rahul Honda");
		srd.setLocation("Shimoga");
		srd.setOwner("Ramesh");
		srd.setType("Bike Showroom");
		
		ShowroomDto srd1=(ShowroomDto)srd.clone();
		System.out.println(srd1);
		
		CanteenDto cd=new CanteenDto();
		cd.setName("Raghu canteen");
		cd.setLocation("Rajajinagar");
		cd.setOwner("Ravi");
		cd.setVarity(12);
		
		CanteenDto cd1=(CanteenDto)cd.clone();
		System.out.println(cd1);
		
		TravelsDto td=new TravelsDto();
		td.setName("Sursti Travels");
		td.setOwner("Sathish");
		td.setContactNo(9876543456l);
		td.setNoOfVehicles(15);
		
		TravelsDto td1=(TravelsDto)td.clone();
		System.out.println(td1);
		
				
	}

}
