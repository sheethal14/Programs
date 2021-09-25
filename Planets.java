class Planets
{
	public String name;
	public int  distance;
	public int size;

	public Planets()
	{
		System.out.println("Planets object is created");
	}

	public void rotation()
	{
		System.out.println("rotation");
	}
	public void display()
	{
	  System.out.println(name+" "+distance+" "+size);
    }

}