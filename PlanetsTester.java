class PlanetsTester
{
	public static void main(String a[])
	{
		Planets planets=new Planets();
		planets.name="Earth";
		planets.distance=150;
		planets.size=12742;
		

        planets.rotation();
		planets.display();

		System.out.println();

		Planets planets1=new Planets();
		planets1.name="venus";
		planets1.distance=108;
		planets1.size=12104;
		

        planets.rotation();
		planets1.display();

		System.out.println();

		Planets planets2=new Planets();
		planets2.name="Saturn";
		planets2.distance=148;
		planets2.size=58232;
		

        planets.rotation();
		planets2.display();

		System.out.println();
	}
}