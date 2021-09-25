class GasCylinder
{
	public String name;
	public String color;
	public int weight;
	public int price;

	public GasCylinder(String name,String color,int weight,int price)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.price=price;
	}
	public void display()
	{
		System.out.println(name+" "+color+" "+weight+" "+price);
	}
	public static void main(String a[])
	{
		GasCylinder gasCylinder=new GasCylinder("HP","Red",25,1200);
		GasCylinder gasCylinder1=new GasCylinder("Bharath","Blue",20,1100);

		gasCylinder.display();
		gasCylinder1.display();


	}
}