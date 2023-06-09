package com.onetoone.service;

import com.onetoone.entity.Employee;
import com.onetoone.entity.Salary;
import com.onetoone.payload.SalaryDto;
import com.onetoone.repository.EmployeeRepository;
import com.onetoone.repository.SalaryRepository;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    private EmployeeRepository employeeRepository;
private SalaryRepository salaryRepository;



    public SalaryService(EmployeeRepository employeeRepository,SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
        this.employeeRepository = employeeRepository;
    }

    public SalaryDto createService(long id, SalaryDto salaryDto) {
        Employee employee =employeeRepository.findById(id).get();
        Salary salary=new Salary();
        salary.setAmount((salaryDto.getAmount()));
        salary.setEmployee(employee);
        Salary sal = salaryRepository.save(salary);

        SalaryDto dto =new SalaryDto();
        dto.setSid(sal.getSid());
        dto.setAmount(sal.getAmount());
        return  dto;

    }
}
