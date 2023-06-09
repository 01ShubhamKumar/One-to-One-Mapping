package com.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private BigDecimal amount;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eid",referencedColumnName = "eid")
    private  Employee employee;
}
