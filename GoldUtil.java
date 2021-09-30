class GoldUtil
{
	public static void main(String a[])
	{
		GoldDTO dto=new GoldDTO();

		dto.setGoldId(9098765);
		dto.setGoldType("White Gold"); 
		dto.setPrice(50000);
		
		System.out.println(dto.getGoldId()+" "+dto.getGoldType()+" "+dto.getPrice());
	}
}