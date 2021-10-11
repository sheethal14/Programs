class SingletonTester
{
	public static void main(String args[])
	{
		Duster duster=Duster.getDuster();
		System.out.println(duster);
		Duster duster=Duster();
		System.out.println(duster1);
		/*Duster duster=new Duster();
		System.out.println(duster);
		Duster duster1=new Duster();
		System.out.println(duster1);*/

	}
}