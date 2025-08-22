package org.example.javaapr25springcontroller.service;

import org.example.javaapr25springcontroller.entity.Employee;
import org.example.javaapr25springcontroller.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	//Add new Employee
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	//Get all employee
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	//Get employee by ID
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).get();
	}

	//Update Employee
	public Employee updateEmployee(Employee employeeDetails, int id) {
		Employee employee = getEmployeeById(id);
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setPhoneNumber(employeeDetails.getPhoneNumber());
		employee.setCompany(employeeDetails.getCompany());
		return employeeRepo.save(employee);
	}

	//Delete Employee
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
}
