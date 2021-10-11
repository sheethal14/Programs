class EarPhoneTester
{
	public static void main(String args[])
	{
		EarPhone earPhone=EarPhone.getEarPhone();
		System.out.println(earPhone);
		EarPhone earPhone1=EarPhone.getEarPhone();
		System.out.println(earPhone1);

		EarPhone earPhone2=new EarPhone();
		System.out.println(earPhone2);
		EarPhone earPhone3=new EarPhone();
		System.out.println(earPhone3);
		
	}
}