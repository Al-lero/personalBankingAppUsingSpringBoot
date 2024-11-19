package com.bankprototype.alerobank.dto.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AccountInfo {

    private String accountName;
    private BigDecimal accountBalance;
    private String accountNumber;
}