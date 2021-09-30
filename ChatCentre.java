class ChatCentre
{
	String centreName;
	int centreId;
	String location;
	String ownerName;
	boolean isOpen;
	String items[]=new String[5];

	public ChatCentre()
	{
		System.out.println("ChatCentre object is created");
	}
	public ChatCentre(String centreName,int centreId,String location,String ownerName,boolean isOpen,String items[])
	{
		this.centreName=centreName;
		this.centreId=centreId;
		this.location=location;
		this.ownerName=ownerName;
		this.isOpen=isOpen;
		this.items=items;
	}
	
	public void display()
	{
		System.out.println(centreName+" "+centreId+" "+location+" "+ownerName+" "+isOpen);
	}
	public void getItems()
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}