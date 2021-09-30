class DrivingLicenseUtil
{
	public static void main(String a[])
	{
		DrivingLicenseDTO dto=new DrivingLicenseDTO();

		dto.setLicenseId(4568009876l);
		dto.setName("Raju"); 
		dto.setAge(45);
		dto.setGender("Male");
		dto.setAddress("Shimoga");
		dto.setType("LMVG");


		System.out.println(dto.getLicenseId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()+" "+dto.getType());
	}
}