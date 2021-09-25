class Google
{
	public String product;
	public String purpose;
	public double rating;

	public Google()
	{
		System.out.println("Google object is created");
	}

	public void search()
	{
		System.out.println("Search whatever you want");
	}
	public void display()
	{
	  System.out.println(product+" "+purpose+" "+rating);
    }

}