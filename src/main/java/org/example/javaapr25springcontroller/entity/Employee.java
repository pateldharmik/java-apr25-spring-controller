package org.example.javaapr25springcontroller.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "EMP")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;

	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	private String phoneNumber;

	private String company;

	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeMachine employeeMachine;

	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeReviews> employeeReviews;

	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;

}
