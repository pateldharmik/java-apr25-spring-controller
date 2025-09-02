package org.example.javaapr25springcontroller.repository;

import org.example.javaapr25springcontroller.entity.EmployeeReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeReviewsRepo extends JpaRepository<EmployeeReviews,Long> {

}
