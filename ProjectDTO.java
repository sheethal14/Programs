public class ProjectDTO
{
	public ProjectDTO()
	{

	}
	private long projectId;
	private String projectName;
	private int noOfMembers;
	private boolean isProjectCompleted;

	public long getProjectId()
	{
		return projectId;
	} 
	public void setProjectId(long projectId)
	{
		this.projectId=projectId;
	}
	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}
	public int getNoOfMembers()
	{
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers)
	{
		this.noOfMembers=noOfMembers;
	}
	public boolean getIsProjectCompleted()
	{
		return isProjectCompleted;
	}
	public void setIsProjectCompleted(boolean isProjectCompleted)
	{
		this.isProjectCompleted=isProjectCompleted;
	}
}