class GoogleTester
{
	public static void main(String a[])
	{
		Google google=new Google();
		google.product="Google map";
		google.purpose="Location Identification";
		google.rating=3.8;
		

        google.search();
		google.display();

		System.out.println();

		Google google1=new Google();
		google1.product="Google pay";
		google1.purpose="Transaction";
		google1.rating=4.2;
		

        google1.search();
		google1.display();

		System.out.println();

		Google google2=new Google();
		google2.product="GMail";
		google2.purpose="Official Communication";
		google2.rating=4.3;
		

        google2.search();
		google2.display();

		System.out.println();
	}
}