package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

@Entity
public class EmployeeData 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int employeeID;
	private String name,mobileNo,emailID;
	
	
	public EmployeeData()
	{
		super();
	}
	public EmployeeData(int employeeID, String name, String mobileNo, String emailID)
	{
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
	}
	@Override
	public String toString() 
	{
		return "EmployeeData [employeeID=" + employeeID + ", name=" + name + ", mobileNo=" + mobileNo + ", emailID="
				+ emailID + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(emailID, employeeID, mobileNo, name);
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
		EmployeeData other = (EmployeeData) obj;
		return Objects.equals(emailID, other.emailID) && employeeID == other.employeeID
				&& Objects.equals(mobileNo, other.mobileNo) && Objects.equals(name, other.name);
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
}
