package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";

    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstName).matches();
    }
}
