class Exam{
	public static String universityName="VTU";
	
	public static void allow(String[]hallTicket)
	{
		System.out.println("start of allow method with Hallticket");
		if(hallTicket!=null)
		{
			getHallTicketDetails(hallTicket);
		}
		else
		{
			System.out.println("Hallticket not found");
		}
		System.out.println("end of allow method with Hallticket");
	}
	public static void allow(int fees)

	{
		System.out.println("start of allow method with fees");
		{
			if (fees>1000)
			{
				System.out.println("fees");
			}
			else
			{
				System.out.println("Please pay the fees");
			}
		}
		System.out.println("end of allow method with fees");
	}
	public static void getHallTicketDetails(String[]hallTicket)
	{
		for(int i=0;i<hallTicket.length;i++)
		{
			System.out.println(hallTicket[i]);
		}
	}
}