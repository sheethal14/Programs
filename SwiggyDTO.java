public class SwiggyDTO
{
	public SwiggyDTO()
	{

	}
	private long orderId;
	private String name;
	private int cost;
	private String address;
	private long number;

	public long getOrderId()
	{
		return orderId;
	} 
	public void setOrderId(long orderId)
	{
		this.orderId=orderId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public long getNumber()
	{
		return number;
	}
	public void setNumber(long number)
	{
		this.number=number;
	}
}