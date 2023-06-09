package com.onetoone.payload;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalaryDto {
     private  Long sid;
     private BigDecimal amount;
}
