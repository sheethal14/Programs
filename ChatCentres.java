class ChatCentres
{
	String centreName;
	int centreId;
	String location;
	String ownerName;
	boolean isOpen;
	String items[]={"PaniPuri","Kachori","Samosa","Pav Bhaji","Sandwich"};

	public ChatCentres()
	{
		this("Sai Chats",450,"near KLE Ground","Ranganth",true);
		System.out.println("ChatCentres object is created");
	}
	public ChatCentres(String centreName,int centreId,String location,String ownerName,boolean isOpen)
	{
		this.centreName=centreName;
		this.centreId=centreId;
		this.location=location;
		this.ownerName=ownerName;
		this.isOpen=isOpen;
	   	
	}
	
	public void display()
	{
		System.out.println(this.centreName+" "+this.centreId+" "+this.location+" "+this.ownerName+" "+this.isOpen);
	}
	public void getItems()
	{
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}