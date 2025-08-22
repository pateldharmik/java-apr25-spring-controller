package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.entity.Employee;
import org.example.javaapr25springcontroller.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployees(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@PutMapping("{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id) {
		return employeeService.updateEmployee(employee,id);
	}

	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted successfully!!!";
	}
}
