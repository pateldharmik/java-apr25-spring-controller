package org.example.javaapr25springcontroller.service;

import org.example.javaapr25springcontroller.dto.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

	List<Student> students = new ArrayList<Student>();

	public List<Student> addStudents(Student student, String action) {

		if("new".equals(action)) {
			students = new ArrayList<>();
		}

		students.add(student);
		return students;
	}
}
