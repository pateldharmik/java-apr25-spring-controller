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
public class EmployeeMachine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long machineId;

	private String serialNumber;

	private String machineBrand;
	private String machineModel;
}
