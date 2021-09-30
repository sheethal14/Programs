class PharmacyUtil
{
	public static void main(String a[])
	{
		PharmacyDTO dto=new PharmacyDTO();

		dto.setPharmacyId(23456786);
		dto.setPharmacyName("Shree Ganesh Medicals"); 
		dto.setOwner("Raghu");
		dto.setAddress("Shimoga");
		
		System.out.println(dto.getPharmacyId()+" "+dto.getPharmacyName()+" "+dto.getOwner()+" "+dto.getAddress());
	}
}