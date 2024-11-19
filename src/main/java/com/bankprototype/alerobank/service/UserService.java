package com.bankprototype.alerobank.service;

import com.bankprototype.alerobank.dto.request.UserRequest;
import com.bankprototype.alerobank.dto.response.BankResponse;

public interface UserService {

   BankResponse createAccount(UserRequest userRequest );
}
