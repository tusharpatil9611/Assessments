package com.Simple;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   int id;
   String batchname;
   int count;
   @OneToMany(cascade = CascadeType.ALL)
   List<Student>student=new ArrayList<Student>();
public Batch() {
	super();
	// TODO Auto-generated constructor stub
}
public Batch(int id, String batchname, int count, List<Student> student) {
	super();
	this.id = id;
	this.batchname = batchname;
	this.count = count;
	this.student = student;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBatchname() {
	return batchname;
}
public void setBatchname(String batchname) {
	this.batchname = batchname;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
@Override
public String toString() {
	return "Batch [id=" + id + ", batchname=" + batchname + ", count=" + count + ", student=" + student + "]";
}
   
   
   
}
