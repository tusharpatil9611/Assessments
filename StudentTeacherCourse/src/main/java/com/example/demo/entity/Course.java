package com.example.demo.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Course {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int courseId;
	private String subCourse;
	@OneToOne(cascade = CascadeType.ALL )
	private Student student;
	//private List<Student> student;
	
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", subCourse=" + subCourse + ", student=" + student + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, student, subCourse);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(student, other.student)
				&& Objects.equals(subCourse, other.subCourse);
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getSubCourse() {
		return subCourse;
	}
	public void setSubCourse(String subCourse) {
		this.subCourse = subCourse;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
