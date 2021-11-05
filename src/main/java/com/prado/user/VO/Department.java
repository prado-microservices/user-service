package com.prado.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	private long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	private int departmentEmployees;
}
