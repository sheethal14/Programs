public class PropertyDTO
{
	public PropertyDTO()
	{

	}
	private long propertyId;
	private String propertyHolder;
	private int cost;
	private String measurement;
	private String address;

	public long getPropertyId()
	{
		return propertyId;
	} 
	public void setPropertyId(long propertyId)
	{
		this.propertyId=propertyId;
	}
	public String getPropertyHolder()
	{
		return propertyHolder;
	}
	public void setPropertyHolder(String propertyHolder)
	{
		this.propertyHolder=propertyHolder;
	}
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public String getMeasurement()
	{
		return measurement;
	}
	public void setMeasurement(String measurement)
	{
		this.measurement=measurement;
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