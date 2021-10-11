class RefrigeratorTester
{
	public static void main(String args[])
	{
		Refrigerator refrigerator=Refrigerator.getRefrigerator();
		System.out.println(refrigerator);
		Refrigerator refrigerator1=Refrigerator.getRefrigerator();
		System.out.println(refrigerator1);

		Refrigerator refrigerator2=new Refrigerator();
		System.out.println(refrigerator2);
		Refrigerator refrigerator3=new Refrigerator();
		System.out.println(refrigerator3);
	}
}