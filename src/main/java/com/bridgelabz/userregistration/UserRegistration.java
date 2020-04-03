package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";
    private static final String lastNamePattern="^[A-Z]{1}[a-z]{2,}";;
    private static final String emailPattern = "^[a-z]{1,}[@](bl|gmail|yahoo|1|abc)(.com|.co|.net)$";
    private static final String pnoneNoPattern = "^[0-9]{2}[ ][0-9]{10}$";
    //private static final String passwordPattern="[a-z]{5,}[A-Z]{1,}[0-9]{1,}";


    public boolean firstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstName).matches();
    }
    public boolean lastName(String lastName){
        Pattern pattern = Pattern.compile(lastNamePattern);
        return pattern.matcher(lastName).matches();
    }
    public boolean phoneNumberValidation(String phoneNo) {
        Pattern pattern = Pattern.compile(pnoneNoPattern);
        return pattern.matcher(phoneNo).matches();
    }
    public boolean emailValidation(String emailID){
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(emailID).matches();
    }
//    public boolean passwordValidation(String password) {
//        Pattern pattern = Pattern.compile(passwordPattern);
//        return pattern.matcher(password).matches();
//    }
}
