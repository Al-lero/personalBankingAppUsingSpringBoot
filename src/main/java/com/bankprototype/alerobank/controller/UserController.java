package com.bankprototype.alerobank.controller;

import com.bankprototype.alerobank.dto.request.UserRequest;
import com.bankprototype.alerobank.dto.response.BankResponse;
import com.bankprototype.alerobank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public BankResponse  createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }

}
