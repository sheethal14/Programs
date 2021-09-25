class City
{
	public String cityName;
	public String state;
	public int population;

	public City()
	{
		System.out.println("City object is created");
	}

	public void welcome()
	{
		System.out.println("Welcome");
	}
	public void display()
	{
	  System.out.println(cityName+" "+state+" "+population);
    }

}