public class DrivingLicenseDTO
{
	public DrivingLicenseDTO()
	{

	}
	private long licenseId;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String type;

	public long getLicenseId()
	{
		return licenseId;
	} 
	public void setLicenseId(long licenseId)
	{
		this.licenseId=licenseId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
}