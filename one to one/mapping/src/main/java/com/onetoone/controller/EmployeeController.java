package com.onetoone.controller;

import com.onetoone.payload.EmployeeDto;
import com.onetoone.payload.SalaryDto;
import com.onetoone.service.EmployeeService;
import com.onetoone.service.SalaryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private  final EmployeeService employeeService;
    private  final SalaryService salaryService;

    private EmployeeController(EmployeeService employeeService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.salaryService = salaryService;
    }
    //http://localhost:8080/api/employee
    @PostMapping
    public ResponseEntity<EmployeeDto>createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployeeDto=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/1/salary
    @PostMapping("/{id}/salary")
    public ResponseEntity<SalaryDto> createSalary(@PathVariable("id") long id,@RequestBody SalaryDto salaryDto){
        SalaryDto dto = salaryService.createService(id, salaryDto);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);

    }
}
