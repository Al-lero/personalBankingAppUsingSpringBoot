package com.bankprototype.alerobank.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreditRequest {
    private String accountNumber;
    public BigDecimal amount;
}