package MyFirstProject;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Loptop implements Serializable{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int lip;
	private String cpu,hdd,ram;
	
	public Loptop(int lip, String cpu, String hdd, String ram)
	{
		super();
		this.lip = lip;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}
	public Loptop()
	{
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		return "loptop [lip=" + lip + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(cpu, hdd, lip, ram);
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
		Loptop other = (Loptop) obj;
		return Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd) && lip == other.lip
				&& Objects.equals(ram, other.ram);
	}
	public int getLip()
	{
		return lip;
	}
	public void setLip(int lip) 
	{
		this.lip = lip;
	}
	public String getCpu() 
	{
		return cpu;
	}
	public void setCpu(String cpu) 
	{
		this.cpu = cpu;
	}
	public String getHdd() 
	{
		return hdd;
	}
	public void setHdd(String hdd)
	{
		this.hdd = hdd;
	}
	public String getRam() 
	{
		return ram;
	}
	public void setRam(String ram)
	{
		this.ram = ram;
	}
	
}
