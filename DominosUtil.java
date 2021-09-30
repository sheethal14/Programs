class DominosUtil
{
	public static void main(String a[])
	{
		DominosDTO dto=new DominosDTO();

		dto.setGstNo(324585623);
		dto.setNoOfItems(25); 
		dto.setAddress("Banglore");
		
		System.out.println(dto.getGstNo()+" "+dto.getNoOfItems()+" "+dto.getAddress());
	}
}