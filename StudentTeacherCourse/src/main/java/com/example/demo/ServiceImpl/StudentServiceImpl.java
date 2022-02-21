package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service1.StudentService;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public List<Student> fetchdata() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public void updatedataStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

}
