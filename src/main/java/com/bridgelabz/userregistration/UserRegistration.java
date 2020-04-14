package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String firstNamePattern = "[A-Z][a-z]{2,}";
    private static final String lastNamePattern="^[A-Z]{1}[a-z]{2,}";;
    private static final String pnoneNumberPattern = "([+]?91[ ]?)?[0-9]{10}";
    private static final String passwordPattern="[a-z]{5,}[A-Z]{1,}[0-9]{1,}";

    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstName).matches();
    }
    public boolean lastName(String lastName){
        Pattern pattern = Pattern.compile(lastNamePattern);
        return pattern.matcher(lastName).matches();
    }
    public boolean phoneNumberValidation(String phoneNo) {
        Pattern pattern = Pattern.compile(pnoneNumberPattern);
        return pattern.matcher(phoneNo).matches();
    }
    public boolean passwordValidation(String password) {
        Pattern pattern = Pattern.compile(passwordPattern);
        return pattern.matcher(password).matches();
    }
}
