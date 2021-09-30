class FancyStore
{
	String name;
	String location;
	int cost;
	boolean isOpen;
	String items[]={"Bangals","Cold Cream","Powder","Nail Paint"};

	public FancyStore()
	{
		this("Bhavya Fancy Store","Malleshwaram 3rd Block",790,true);
		System.out.println("FancyStore object is created");
	}
	public FancyStore(String name,String location,int cost,boolean isOpen)
	{
		this.name=name;
		this.location=location;
		this.cost=cost;
		this.isOpen=isOpen;
	   	
	}
	
	public void display()
	{
		System.out.println(this.name+" "+this.location+" "+this.cost+" "+this.isOpen);
	}
	public void getItems()
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}