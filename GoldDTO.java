public class GoldDTO
{
	public GoldDTO()
	{

	}
	private long goldId;
	private String goldType;
	private int price;
	
	public long getGoldId()
	{
		return goldId;
	} 
	public void setGoldId(long goldId)
	{
		this.goldId=goldId;
	}
	public String getGoldType()
	{
		return goldType;
	}
	public void setGoldType(String goldType)
	{
		this.goldType=goldType;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}