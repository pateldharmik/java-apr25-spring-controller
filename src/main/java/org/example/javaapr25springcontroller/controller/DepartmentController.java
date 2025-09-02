package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.entity.Department;
import org.example.javaapr25springcontroller.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/getAll")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("/get/{id}")
	public Optional<Department> getDepartmentById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	}

	@PatchMapping("/patch")
	public Department patchDepartment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}

	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}
}
