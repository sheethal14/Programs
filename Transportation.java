class Transportation
{
	String agencyName;
	int cost;
	String type;
	boolean isAvailable;

	public Transportation()
	{
		this("Gajanana",500,"Roadways",true);
		System.out.println("Transportation object is created");
	}
	public Transportation(String agencyName,int cost,String type,boolean isAvailable)
	{
		this.agencyName=agencyName;
		this.cost=cost;
		this.type=type;
		this.isAvailable=isAvailable;
		
	}
	
	public void display()
	{
		System.out.println(this.agencyName+" "+this.cost+" "+this.type+" "+this.isAvailable);
	}
}