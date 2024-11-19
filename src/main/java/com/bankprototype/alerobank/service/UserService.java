package com.bankprototype.alerobank.service;

import com.bankprototype.alerobank.dto.request.CreditRequest;
import com.bankprototype.alerobank.dto.request.DebitRequest;
import com.bankprototype.alerobank.dto.request.EnquiryRequest;
import com.bankprototype.alerobank.dto.request.UserRequest;
import com.bankprototype.alerobank.dto.response.BankResponse;

public interface UserService {

   BankResponse createAccount(UserRequest userRequest );
   BankResponse balanceEnquiry(EnquiryRequest request);

   String nameEnquiry(EnquiryRequest request);

   BankResponse creditAccount(CreditRequest request);
   BankResponse debitAccount(DebitRequest request);
}
