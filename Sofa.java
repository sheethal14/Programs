class Sofa
{
	public String name;
	public String color;
	public int size;
	public int price;

	public Sofa(String name,String color,int size,int price)
	{
		this.name=name;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	public void display()
	{
		System.out.println(name+" "+color+" "+size+" "+price);
	}
	public static void main(String a[])
	{
		Sofa sofa=new Sofa("abc","Black",20,40000);
		Sofa sofa1=new Sofa("xyz","Brown",30,50000);

		sofa.display();
		sofa1.display();


	}
}