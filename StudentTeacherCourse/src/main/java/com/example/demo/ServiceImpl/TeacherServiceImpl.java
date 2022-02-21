package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service1.TeacherService1;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService1 {

	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> listTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepository.save(teacher);
	}

}
