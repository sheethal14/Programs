class Appliances
{
	String brandName;
	int brandId;
	boolean isAvailable;
	String items[]={"Mobile","Telivision","Refrigerator","Air conditioner"};

	public Appliances()
	{
		this("Samsung",450525,true);
		System.out.println("Appliances object is created");
	}
	public Appliances(String brandName,int brandId,boolean isAvailable)
	{
		this.brandName=brandName;
		this.brandId=brandId;
		this.isAvailable=isAvailable;
		
	   	
	}
	
	public void display()
	{
		System.out.println(this.brandName+" "+this.brandId+" "+this.isAvailable);
	}
	public void getItems()
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}