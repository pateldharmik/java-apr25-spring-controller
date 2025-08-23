package org.example.javaapr25springcontroller.repository;

import org.example.javaapr25springcontroller.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	//Custom method to find employee by NAME.
	List<Employee> findAllByFirstName(String firstName);
}
