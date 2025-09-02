package org.example.javaapr25springcontroller.util;

import org.example.javaapr25springcontroller.dto.EmployeeDTO;
import org.example.javaapr25springcontroller.entity.Department;
import org.example.javaapr25springcontroller.entity.Employee;

public class EmployeeDtoConverter {

	public static Employee dtoToEntity(EmployeeDTO employeeDTO, Department department) {

		if (employeeDTO == null) {
			return null;
		}

		Employee employee = new Employee();
		employee.setEmployeeId(employeeDTO.getEId());
		employee.setFirstName(employeeDTO.getEFName());
		employee.setLastName(employeeDTO.getELName());
		employee.setPhoneNumber(employeeDTO.getEPNum());
		employee.setDepartment(department);

		return employee;
	}

	public static EmployeeDTO entityToDto(Employee employee) {

		if (employee == null) {
			return null;
		}

		EmployeeDTO employeeDTO = new EmployeeDTO();

		employeeDTO.setEId(employee.getEmployeeId());
		employeeDTO.setEFName(employee.getFirstName());
		employeeDTO.setELName(employee.getLastName());
		employeeDTO.setEPNum(employee.getPhoneNumber());

		return employeeDTO;
	}
}
