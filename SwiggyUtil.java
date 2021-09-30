class SwiggyUtil
{
	public static void main(String a[])
	{
		SwiggyDTO dto=new SwiggyDTO();

		dto.setOrderId(895625632);
		dto.setName("Ramesh"); 
		dto.setCost(900);
		dto.setAddress("Rajajinagar");
		dto.setNumber(789098768);

		System.out.println(dto.getOrderId()+" "+dto.getName()+" "+dto.getCost()+" "+dto.getAddress()+" "+dto.getNumber());
	}
}