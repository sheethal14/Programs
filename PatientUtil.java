class PatientUtil
{
	public static void main(String a[])
	{
		PatientDTO dto=new PatientDTO();

		dto.setPatientId(234567890l);
		dto.setPatientName("Sheethal"); 
		dto.setAge(78);
		dto.setGender("Female");
		dto.setAddress("Chikkamaglore");
		dto.setBloodGroup("o+");

		System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()+" "+dto.getBloodGroup());
	}
}