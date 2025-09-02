package org.example.javaapr25springcontroller.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class EmployeeDTO {

	private Integer eId;
	private String eFName;
	private String eLName;
	private String ePNum;

}
