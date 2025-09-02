package org.example.javaapr25springcontroller.repository;

import org.example.javaapr25springcontroller.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
