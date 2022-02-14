package MyFirstProject;

import java.util.Objects;

public class Person {
	private int pid;
	private String name,address,phoneNo;
	
	public Person() {
		super();
	}
	public Person(int pid, String name, String address, String phoneNo)
	{
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(address, name, phoneNo, pid);
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
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNo, other.phoneNo) && pid == other.pid;
	}
	@Override
	public String toString() 
	{
		return "person [pid=" + pid + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}
	public int getPid() 
	{
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
