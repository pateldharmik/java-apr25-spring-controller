package org.example.javaapr25springcontroller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Department {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long departmentId;

	private String departmentName;

	private String headOfDepartment;
}
