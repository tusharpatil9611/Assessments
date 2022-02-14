package com.Simple.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Simple.entity.Course;

public interface courserepo extends JpaRepository<Course, Integer> 
{

}
