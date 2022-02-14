package com.Simple;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int count;
	
	public Batch() {
		super();
	}
	public Batch(int id, String name, int count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(count, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		return count == other.count && id == other.id && Objects.equals(name, other.name);
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
