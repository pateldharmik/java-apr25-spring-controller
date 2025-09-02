package org.example.javaapr25springcontroller.service;

import org.example.javaapr25springcontroller.entity.Department;
import org.example.javaapr25springcontroller.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

	public Optional<Department> getDepartmentById(Long id) {
		return departmentRepo.findById(id);
	}

	public Department updateDepartment(Department department) {
		Optional<Department> optionalDepartment = getDepartmentById(department.getDepartmentId());
		if (optionalDepartment.isPresent()) {
			Department entity = optionalDepartment.get();
			if (Objects.nonNull(department.getDepartmentName())) {
				entity.setDepartmentName(department.getDepartmentName());
			}
			if (Objects.nonNull(department.getHeadOfDepartment())) {
				entity.setHeadOfDepartment(department.getHeadOfDepartment());
			}
			return departmentRepo.save(entity);
		}
		return null;
	}

	public void deleteDepartment(Long id) {
		departmentRepo.deleteById(id);
	}
}
