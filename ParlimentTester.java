class ParlimentTester
{
	public static void main(String a[])
	{
		Parliment parliment=new Parliment();
		parliment.house="Rajya Sabha";
		parliment.members=245;
		

        parliment.ruling();
		parliment.display();

		System.out.println();

		Parliment parliment1=new Parliment();
		parliment1.house="Lok Sabha";
		parliment1.members=543;
		

        parliment1.ruling();
		parliment1.display();

		
	}
}