package com.bankprototype.alerobank.service;

import com.bankprototype.alerobank.data.model.User;
import com.bankprototype.alerobank.dto.request.AccountInfo;
import com.bankprototype.alerobank.dto.request.EmailDetails;
import com.bankprototype.alerobank.dto.request.UserRequest;
import com.bankprototype.alerobank.dto.response.BankResponse;
import com.bankprototype.alerobank.data.repository.UserRepository;
import com.bankprototype.alerobank.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class   UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    EmailService emailService;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {

        if(userRepository.existsUserByEmail(userRequest.getEmail())){
            return BankResponse.builder()
                    .responseCode(AccountUtils.Account_Exist_Code)
                    .responseMessage(AccountUtils.Account_Exists_Message)
                    .accountInfo(null)
//
                    .build();

        }
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .email(userRequest.getEmail())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.genericAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .phoneNumber(userRequest.getPhoneNumber())
                .alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
                .status("Active")
                .build();

        User savedUser = userRepository.save(newUser);
        // to send alert
        EmailDetails emailDetails = EmailDetails.builder()
                .recipient(savedUser.getEmail())
                .subject("Account Created")
                .messageBody("Welcome to Alero Bank, Account created Successfully.\n Your Account Details: \n" +
                        "Account Name: " + savedUser.getFirstName() + " " + savedUser.getLastName() + " " + savedUser.getOtherName() + "\nAccount Number: " + savedUser.getAccountNumber())
                .build();
        emailService.sendEmailAlert(emailDetails);

        return BankResponse.builder()
                .responseCode(AccountUtils.Account_Creation_Success)
                .responseMessage(AccountUtils.Account_Creation_Message )
                .accountInfo(AccountInfo.builder()
                        .accountBalance(savedUser.getAccountBalance())
                        .accountNumber(savedUser.getAccountNumber())
                        .accountName(savedUser.getFirstName() + " " + savedUser.getLastName() + " " + savedUser.getOtherName())
                        .build())

                .build();

    }



}

