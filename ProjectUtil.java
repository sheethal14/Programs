class ProjectUtil
{
	public static void main(String a[])
	{
		ProjectDTO dto=new ProjectDTO();

		dto.setProjectId(3235687654l);
		dto.setProjectName("Prototype Model Of a Supercapacitor powered Electric Bicycle"); 
		dto.setNoOfMembers(4);
		dto.setIsProjectCompleted(true);
		
		System.out.println(dto.getProjectId()+" "+dto.getProjectName()+" "+dto.getNoOfMembers()+" "+dto.getIsProjectCompleted());
	}
}