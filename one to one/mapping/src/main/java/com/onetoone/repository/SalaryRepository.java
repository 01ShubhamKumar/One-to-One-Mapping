package com.onetoone.repository;

import com.onetoone.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary ,Long> {
}
