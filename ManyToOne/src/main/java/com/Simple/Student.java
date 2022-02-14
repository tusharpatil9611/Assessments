package com.Simple;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String name;
  int mark;
  @ManyToOne(cascade = CascadeType.ALL)
 private Batch batch;
  
  
public Student() {
	super();
}
public Student(int id, String name, int mark, Batch batch) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
	this.batch = batch;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", batch=" + batch + "]";
}
@Override
public int hashCode() {
	return Objects.hash(batch, id, mark, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(batch, other.batch) && id == other.id && mark == other.mark
			&& Objects.equals(name, other.name);
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
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public Batch getBatch() {
	return batch;
}
public void setBatch(Batch batch) {
	this.batch = batch;
}
  
  

  
}
