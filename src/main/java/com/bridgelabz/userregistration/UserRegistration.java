package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";
    private static final String emailPattern = "^[a-z]{1,}[@](bl|gmail|yahoo|1|abc)(.com|.co|.net)$";

    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstName).matches();
    }
    public boolean emailValidation(String emailID){
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(emailID).matches();
    }
}
