package org.example.javaapr25springcontroller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {

	private Integer studentID;
	private String firstName;
	private String lastName;
}
