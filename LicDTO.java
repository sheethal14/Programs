public class LicDTO
{
	public LicDTO()
	{

	}
	private long licId;
	private String policyHolder;
	private int maturityYear;
	private String nominee;

	public long getLicId()
	{
		return licId;
	} 
	public void setLicId(long licId)
	{
		this.licId=licId;
	}
	public String getPolicyHolder()
	{
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder)
	{
		this.policyHolder=policyHolder;
	}
	public int getMaturityYear()
	{
		return maturityYear;
	}
	public void setMaturityYear(int maturityYear)
	{
		this.maturityYear=maturityYear;
	}
	public String getNominee()
	{
		return nominee;
	}
	public void setNominee(String nominee)
	{
		this.nominee=nominee;
	}
}