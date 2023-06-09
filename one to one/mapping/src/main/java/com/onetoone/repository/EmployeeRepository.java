package com.onetoone.repository;

import com.onetoone.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
}
