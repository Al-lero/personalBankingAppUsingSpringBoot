package com.bankprototype.alerobank.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnquiryRequest {
    private String accountNumber;
}
