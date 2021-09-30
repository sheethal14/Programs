class Ecommerce
{
	String name;
	int orderId;
	String location;
	boolean isDelivered;
	String items[]={"Furniture","Mask","YogaMat","SmartWatch"};

	public Ecommerce()
	{
		this("Amazon",456789,"Rajajinagar",true);
		System.out.println("Ecommerce object is created");
	}
	public Ecommerce(String name,int orderId,String location,boolean isDelivered)
	{
		this.name=name;
		this.orderId=orderId;
		this.location=location;
		this.isDelivered=isDelivered;
	   	
	}
	
	public void display()
	{
		System.out.println(this.name+" "+this.orderId+" "+this.location+" "+this.isDelivered);
	}
	public void getItems()
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}