package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	private int mark;
	public Student() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Student(int id, String studentName, int mark) 
	{
	super();
	this.id = id;
	this.studentName = studentName;
	this.mark = mark;
	}
	@Override
	public int hashCode() {
	return Objects.hash(id, mark, studentName);
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
	return id == other.id && mark == other.mark && Objects.equals(studentName, other.studentName);
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getStudentName() {
	return studentName;
	}
	public void setStudentName(String studentName) {
	this.studentName = studentName;
	}
	public int getMark() {
	return mark;
	}
	public void setMark(int mark) {
	this.mark = mark;
	}
	@Override
	public String toString() {
	return "Student [id=" + id + ", studentName=" + studentName + ", mark=" + mark + "]";
	}

}
