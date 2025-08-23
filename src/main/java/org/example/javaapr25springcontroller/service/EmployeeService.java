package org.example.javaapr25springcontroller.service;

import org.example.javaapr25springcontroller.entity.Employee;
import org.example.javaapr25springcontroller.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepo.findById(id);
	}

	//Get employee by Name ---> Custom "findByName" method.
	public List<Employee> getEmployeeByName(String firstName) {
		return employeeRepo.findAllByFirstName(firstName);
	}

	//Update Employee (PUT Mapping)
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> optionalEmployee = getEmployeeById(employee.getEmployeeId());
		if (optionalEmployee.isPresent()) {
			employee = employeeRepo.save(employee);
		}
		return employee;
	}

	//Update Employee (PATCH Mapping)
	public Employee patchEmployee(Employee dto) {
		Optional<Employee> optionalEmployee = getEmployeeById(dto.getEmployeeId());
		if (optionalEmployee.isPresent()) {
			Employee entity = optionalEmployee.get();
			if (Objects.nonNull(dto.getFirstName())){
				entity.setFirstName(dto.getFirstName());
			}
			if (Objects.nonNull(dto.getLastName())){
				entity.setLastName(dto.getLastName());
			}
			if (Objects.nonNull(dto.getPhoneNumber())){
				entity.setPhoneNumber(dto.getPhoneNumber());
			}
			if (Objects.nonNull(dto.getCompany())){
				entity.setCompany(dto.getCompany());
			}
			return employeeRepo.save(entity);
		}
		return null;
	}

	//Delete Employee
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
}
