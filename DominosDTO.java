public class DominosDTO
{
	public DominosDTO()
	{

	}
	private long gstNo;
	private int noOfItems;
	private String address;

	public long getGstNo()
	{
		return gstNo;
	} 
	public void setGstNo(long gstNo)
	{
		this.gstNo=gstNo;
	}
	public int getNoOfItems()
	{
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems)
	{
		this.noOfItems=noOfItems;
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