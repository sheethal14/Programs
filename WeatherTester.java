class WeatherTester
{
	public static void main(String a[])
	{
		Weather weather=new Weather();
		weather.name="Winter";
		weather.period="Dec-Jan";
		weather.duration=2;
		

        weather.seasons();
		weather.display();

		System.out.println();

		Weather weather1=new Weather();
		weather1.name="Spring";
		weather1.period="Feb-Mar";
		weather1.duration=2;
		

        weather1.seasons();
		weather1.display();

		System.out.println();

		Weather weather2=new Weather();
		weather2.name="Summer";
		weather2.period="Apr-jun";
		weather2.duration=3;
		

        weather2.seasons();
		weather2.display();

		System.out.println();
	}
}