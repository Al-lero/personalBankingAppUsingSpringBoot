package com.bankprototype.alerobank.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailDetails {

    private String recipient;
    private String messageBody;
    private String subject;
    private String attachment;
}

