package MyFirstProject;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Employee extends Person {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long employeeID;
	    private String departmentName;
	    @OneToOne(cascade = CascadeType.ALL)			//one to one relation 
	    private Loptop laptop;
	    
	    @OneToMany(cascade = CascadeType.ALL,
	            orphanRemoval = true,
	            targetEntity = contact.class,
	            fetch = FetchType.LAZY)
	    private List<contact> contactDetails;
	    
		public List<contact> getContactDetails()
		{
			return contactDetails;
		}
		public void setContactDetails(List<contact> contactDetails) 
		{
			this.contactDetails = contactDetails;
		}
		public Employee()
		{
			super();
		}
		public Employee(long employeeID, String departmentName, Loptop laptop) 
		{
			super();
			this.employeeID = employeeID;
			this.departmentName = departmentName;
			this.laptop = laptop;
		}
		@Override
		public String toString() 
		{
			return "Employee [employeeID=" + employeeID + ", departmentName=" + departmentName + ", laptop=" + laptop
					+ "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(departmentName, employeeID, laptop);
			return result;
		}
		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(departmentName, other.departmentName) && employeeID == other.employeeID
					&& Objects.equals(laptop, other.laptop);
		}
		public long getEmployeeID()
		{
			return employeeID;
		}
		public void setEmployeeID(long employeeID)
		{
			this.employeeID = employeeID;
		}
		public String getDepartmentName() 
		{
			return departmentName;
		}
		public void setDepartmentName(String departmentName)
		{
			this.departmentName = departmentName;
		}
		public Loptop getLaptop() 
		{
			return laptop;
		}
		public void setLaptop(Loptop laptop)
		{
			this.laptop = laptop;
		}
}
