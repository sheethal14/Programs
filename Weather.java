class Weather
{
	public String name;
	public String period;
	public int duration;

	public Weather()
	{
		System.out.println("Weather object is created");
	}

	public void seasons()
	{
		System.out.println("Seasonal Effects");
	}
	public void display()
	{
	  System.out.println(name+" "+period+" "+duration);
    }

}