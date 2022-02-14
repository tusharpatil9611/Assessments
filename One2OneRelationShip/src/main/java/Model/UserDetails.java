package Model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	 @OneToOne(cascade = CascadeType.ALL)
	 private Address address;
	 
	public UserDetails() {
		super();
	}
	public UserDetails(int userId, String userName, Address address) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}
	@Override
	public String toString() 
	{
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(address, userId, userName);
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
		UserDetails other = (UserDetails) obj;
		return Objects.equals(address, other.address) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
