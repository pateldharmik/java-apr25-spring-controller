package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.dto.EmployeeDTO;
import org.example.javaapr25springcontroller.entity.Employee;
import org.example.javaapr25springcontroller.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	//Add new Employee
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee) {
		Employee createdEmployee = employeeService.addEmployee(employee);
		ResponseEntity<Employee> responseEntityEmployee = ResponseEntity
				.status(HttpStatusCode.valueOf(201))
				.header("content-type", "application/json")
				.header("status","201")
				.body(createdEmployee);

		return responseEntityEmployee;
	}

	//Get all Employee's
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	//Get all Employee's using DTOs
	@GetMapping("/getAllDto")
	public List<EmployeeDTO>  getAllDtoEmployees() {
		return employeeService.getAllEmployeeDTOs();
	}

	//Get Employee by ID
	@GetMapping("/get/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	//Get Employee by Name
	@GetMapping("/get/{firstName}")
	public List<Employee> getEmployeeByName(@PathVariable String firstName) {
		return employeeService.getEmployeeByName(firstName);
	}

	//Update Employee using PUT ---> update all the data. If new data not given then update with 'null'
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	//Update Employee using PATCH ---> update only part of the data that is given. Keep rest data same.
	@PatchMapping("/patch")
	public Employee patchEmployee(@RequestBody Employee employee) {
		return employeeService.patchEmployee(employee);
	}

	//Delete Employee
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
