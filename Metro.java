class Metro
{
	String stationName;
	int stationNo;
	String location;
	boolean isOpen;

	public Metro()
	{
		this("MahaKavi Kuvempu",05,"Rajajinagar",true);
		System.out.println("Metro object is created");
	}
	public Metro(String stationName,int stationNo,String location,boolean isOpen)
	{
		this.stationName=stationName;
		this.stationNo=stationNo;
		this.location=location;
		this.isOpen=isOpen;
	   	
	}
	
	public void display()
	{
		System.out.println(this.stationName+" "+this.stationNo+" "+this.location+" "+this.isOpen);
	}
}