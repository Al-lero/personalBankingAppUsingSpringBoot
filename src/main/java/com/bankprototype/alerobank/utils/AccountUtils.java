package com.bankprototype.alerobank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String Account_Exist_Code = "001";

    public static final String Account_Exists_Message = "This user already has an Account created!";

    public static final String Account_Creation_Success = "002";

    public static final String Account_Creation_Message = "Account has been created Successfully";

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