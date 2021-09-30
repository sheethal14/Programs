class LicUtil
{
	public static void main(String a[])
	{
		LicDTO dto=new LicDTO();

		dto.setLicId(876543098);
		dto.setPolicyHolder("Ravi"); 
		dto.setMaturityYear(2030);
		dto.setNominee("Rashi");
		
		System.out.println(dto.getLicId()+" "+dto.getPolicyHolder()+" "+dto.getMaturityYear()+" "+dto.getNominee());
	}
}