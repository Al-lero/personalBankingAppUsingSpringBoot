package com.bankprototype.alerobank.service;

import com.bankprototype.alerobank.dto.request.*;
import com.bankprototype.alerobank.dto.response.BankResponse;

public interface UserService {

   BankResponse createAccount(UserRequest userRequest );

   BankResponse balanceEnquiry(EnquiryRequest request);

   String nameEnquiry(EnquiryRequest request);

   BankResponse creditAccount(CreditRequest request);

   BankResponse debitAccount(DebitRequest request);

   BankResponse transfer(TransferRequest request);
}
