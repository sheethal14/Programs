class ChatCentreUtil
{
	public static void main(String a[])
	{
		ChatCentre centre=new ChatCentre();
		centre.items[0]="PaniPuri";
		centre.items[1]="Kachori";
		centre.items[2]="Samosa";
		centre.items[3]="Pav Bhaji";
		centre.items[4]="Sandwich";
		ChatCentre centre1=new ChatCentre("Sai Chats",450,"near KLE Ground","Ranganth",true,centre.items);
		centre1.display();
		centre1.getItems();
	}
}