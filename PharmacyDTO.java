public class PharmacyDTO
{
	public PharmacyDTO()
	{

	}
	private long pharmacyId;
	private String pharmacyName;
	private String owner;
	private String address;
	
	public long getPharmacyId()
	{
		return pharmacyId;
	} 
	public void setPharmacyId(long pharmacyId)
	{
		this.pharmacyId=pharmacyId;
	}
	public String getPharmacyName()
	{
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName)
	{
		this.pharmacyName=pharmacyName;
	}
	
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner=owner;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
}