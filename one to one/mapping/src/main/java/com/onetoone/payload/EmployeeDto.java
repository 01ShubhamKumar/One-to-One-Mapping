package com.onetoone.payload;

import lombok.Data;

@Data
public class EmployeeDto {
    private  Long eid;
    private  String name;
    private  String mobile;
    private SalaryDto salaryDto;
}
