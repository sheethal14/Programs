class EarPhone
{
	private static EarPhone earPhone=null;

	public static EarPhone getEarPhone()
	{
		return earPhone;
	}
	static
	{
		earPhone=new EarPhone();
	}
}