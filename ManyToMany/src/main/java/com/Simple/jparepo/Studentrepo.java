package com.Simple.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Simple.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
