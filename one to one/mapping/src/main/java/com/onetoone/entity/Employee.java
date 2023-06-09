package com.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long eid;
    private String name;
    private  String mobile;
    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  Salary salary;
}
