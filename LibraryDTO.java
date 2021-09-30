public class LibraryDTO
{
	public LibraryDTO()
	{

	}
	private long libraryId;
	private String libraryName;
	private int books;
	private String type;
	private String address;

	public long getLibraryId()
	{
		return libraryId;
	} 
	public void setLibraryId(long libraryId)
	{
		this.libraryId=libraryId;
	}
	public String getLibraryName()
	{
		return libraryName;
	}
	public void setLibraryName(String libraryName)
	{
		this.libraryName=libraryName;
	}
	public int getBooks()
	{
		return books;
	}
	public void setBooks(int books)
	{
		this.books=books;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
}