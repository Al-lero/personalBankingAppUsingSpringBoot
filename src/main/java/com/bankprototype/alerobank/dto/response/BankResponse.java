package com.bankprototype.alerobank.dto.response;

import com.bankprototype.alerobank.dto.request.AccountInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankResponse {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
