package org.example.javaapr25springcontroller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String company;
}
