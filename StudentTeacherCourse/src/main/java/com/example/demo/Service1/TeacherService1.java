package com.example.demo.Service1;

import java.util.List;

import com.example.demo.entity.Teacher;

public interface TeacherService1 {

		public void saveTeacher(Teacher teacher);
		public List<Teacher>listTeacher();
		public void deleteTeacher(int id);
		public void updateTeacher(Teacher teacher);
}
