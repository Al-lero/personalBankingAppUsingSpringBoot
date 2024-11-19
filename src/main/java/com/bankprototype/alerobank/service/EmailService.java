package com.bankprototype.alerobank.service;

import com.bankprototype.alerobank.dto.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
