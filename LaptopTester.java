class LaptopTester
{
	public static void main(String args[])
	{
		HP hp=new HP();
		hp.price=50000.00;
		hp.processor="Intel";
		hp.storage="500GB";
		hp.modelNo="14q-345678";

		String store =hp.store();
		System.out.println(store);
		hp.display();
	}
}