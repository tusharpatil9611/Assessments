
package com.example.demo.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	private String studntName;
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", studntName=" + studntName + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, stdId, studntName);
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
		return Objects.equals(course, other.course) && stdId == other.stdId
				&& Objects.equals(studntName, other.studntName);
	}

	@ManyToMany(cascade = CascadeType.ALL )
	private List<Course>course;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStudntName() {
		return studntName;
	}

	public void setStudntName(String studntName) {
		this.studntName = studntName;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
}
