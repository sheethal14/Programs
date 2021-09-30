class PropertyUtil
{
	public static void main(String a[])
	{
		PropertyDTO dto=new PropertyDTO();

		dto.setPropertyId(9876544658l);
		dto.setPropertyHolder("Raghu"); 
		dto.setCost(500000);
		dto.setMeasurement("900 sqft");
		dto.setAddress("Shimoga");

		System.out.println(dto.getPropertyId()+" "+dto.getPropertyHolder()+" "+dto.getCost()+" "+dto.getMeasurement()+" "+dto.getAddress());
	}
}