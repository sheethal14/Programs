class Gun
{
	public Gun()
	{
		System.out.println("Constructor is called");
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

	static{
		System.out.println("Static Block is Excuted");
	}

	{
		System.out.println("Instance Block is Excuted");
	}
}