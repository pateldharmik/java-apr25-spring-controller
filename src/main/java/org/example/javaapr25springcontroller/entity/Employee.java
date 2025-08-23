package org.example.javaapr25springcontroller.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
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
}
