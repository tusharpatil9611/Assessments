package MyFirstProject;

import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Project {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectID;
    private String projectName;
    @Version
    private Integer vesion;
    @Embedded
    private Address address;
    
	public Project()
	{
		super();
	}
	public Project(Long projectID, String projectName, Integer vesion, Address address)
	{
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.vesion = vesion;
		this.address = address;
	}
	@Override
	public String toString() 
	{
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", vesion=" + vesion + ", address="
				+ address + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(address, projectID, projectName, vesion);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(address, other.address) && Objects.equals(projectID, other.projectID)
				&& Objects.equals(projectName, other.projectName) && Objects.equals(vesion, other.vesion);
	}
	public Long getProjectID()
	{
		return projectID;
	}
	public void setProjectID(Long projectID) 
	{
		this.projectID = projectID;
	}
	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName) 
	{
		this.projectName = projectName;
	}
	public Integer getVesion()
	{
		return vesion;
	}
	public void setVesion(Integer vesion)
	{
		this.vesion = vesion;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	
}
