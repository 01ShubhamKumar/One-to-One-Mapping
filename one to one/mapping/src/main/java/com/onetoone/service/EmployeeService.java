package com.onetoone.service;

import com.onetoone.entity.Employee;
import com.onetoone.payload.EmployeeDto;
import com.onetoone.repository.EmployeeRepository;
import com.onetoone.repository.SalaryRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private SalaryRepository salaryRepository;

    public EmployeeService(EmployeeRepository employeeRepository, SalaryRepository salaryRepository) {
        this.employeeRepository = employeeRepository;
        this.salaryRepository = salaryRepository;
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee=new Employee();
        employee.setName(employeeDto.getName());
        employee.setMobile(employeeDto.getMobile());
        Employee savedemployee=employeeRepository.save(employee);
        EmployeeDto savedEmployeeDTO=mapEmployeeToDTO(savedemployee);
        return employeeDto;
    }

    private EmployeeDto mapEmployeeToDTO(Employee employee) {
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setEid(employee.getEid());
        employeeDto.setName(employee.getName());
        employeeDto.setMobile(employeeDto.getMobile());
        return employeeDto;
    }
}
