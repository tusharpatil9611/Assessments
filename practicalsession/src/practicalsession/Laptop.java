package practicalsession;

import java.util.Objects;

public class Laptop {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + "]";
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
