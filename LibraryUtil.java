class LibraryUtil
{
	public static void main(String a[])
	{
		LibraryDTO dto=new LibraryDTO();

		dto.setLibraryId(3456898765l);
		dto.setLibraryName("Central Library"); 
		dto.setBooks(50000);
		dto.setType("General");
		dto.setAddress("Banglore");

		System.out.println(dto.getLibraryId()+" "+dto.getLibraryName()+" "+dto.getBooks()+" "+dto.getType()+" "+dto.getAddress());
	}
}