class CityTester
{
	public static void main(String a[])
	{
		City city=new City();
		city.cityName="Chikkamaglore";
		city.state="Karnataka";
		city.population=34467688;
		

        city.welcome();
		city.display();

		System.out.println();

		City city1=new City();
		city1.cityName="Shimoga";
		city1.state="Karnataka";
		city1.population=9847688;
		

        city1.welcome();
		city1.display();

		System.out.println();

		City city2=new City();
		city2.cityName="Hyderbad";
		city2.state="Telangana";
		city2.population=34467688;
		

        city2.welcome();
		city2.display();

		System.out.println();

	}
}