package com.bankprototype.alerobank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String Account_Exist_Code = "001";

    public static final String Account_Exists_Message = "This user already has an Account created!";

    public static final String Account_Creation_Success = "002";

    public static final String Account_Creation_Message = "Account has been created Successfully";

    public static final String Account_Not_Exist_Code = "010";

    public static final String Account_Not_Exist_Message = "User with this Account number does not exist";

    public static final String Account_Found_code = "007";

    public static final String Account_Found_Success = "UserAccount Found";

    public static final String Account_Credited_Successfully_Code = "009";

    public static final String Account_Credited_Success_Message = "User Account Credited Sucessfully";

    public static final String Insufficient_Balance_Code = "006";

    public static final String Insufficient_Balance_message = "Insufficient Balance";

    public static final String Account_Debited_Code = " 008";

    public static final String Account_Debited_Message = "Amount Debited Successfully";

    public static final String Transfer_Successful_Code = "003";

    public static final String Transfer_Successfully_Message = " Transfer Successful!";

    public static String genericAccountNumber() {

        Year currentYear = Year.now();
        int minimumNumber = 100000;
        int maximumNumber = 999999;

        int randNumber = (int) Math.floor(Math.random() * (maximumNumber - minimumNumber + 1) + minimumNumber);
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);

        return year + randomNumber;

    }
}