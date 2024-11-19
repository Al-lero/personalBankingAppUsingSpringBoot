package com.bankprototype.alerobank.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class  UserRequest {


        private String firstName;
        private String lastName;
        private String otherName;
        private String email;
        private String gender;
        private String address;
        private String stateOfOrigin;
        private String phoneNumber;
        private String alternativePhoneNumber;

    }



