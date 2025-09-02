package org.example.javaapr25springcontroller.repository;

import org.example.javaapr25springcontroller.entity.EmployeeMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMachineRepo extends JpaRepository<EmployeeMachine,Long> {
}
