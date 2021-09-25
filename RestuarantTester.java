class RestuarantTester
{
	public static void main(String a[])
	{
		Restuarant rest=new Restuarant();
		rest.restuarantId=67839;
		rest.restuarantName="1947";
		rest.type="Veg";
		rest.location="Malleshwaram";
		rest.ownerName="Sadananda Gowda";
		

		rest.serveFood();
		rest.displayRestuarantDrtails();

		System.out.println();

		Restuarant rest1=new Restuarant();
		rest1.restuarantId=6388357;
		rest1.restuarantName="Empire";
		rest1.type="Non-Veg";
		rest1.location="kormangala";
		rest1.ownerName="Ravi";
		
		rest.serveFood();
		rest1.displayRestuarantDrtails();


	}
}