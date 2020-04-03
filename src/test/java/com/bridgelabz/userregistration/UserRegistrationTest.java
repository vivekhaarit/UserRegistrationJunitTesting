package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void firstNameTest() {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.firstName("Vivek");
        Assert.assertTrue(result);
    }
    @Test
    public void lastNameTest() {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.lastName("Haarit");
        Assert.assertTrue(result);
    }
    @Test
    public void phoneNumberTest() {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.phoneNumberValidation("91 9608583308");
        Assert.assertTrue(result);
    }
   @Test
    public void passwordTest() {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.passwordValidation("vivekkHAARIT567");
        Assert.assertTrue(result);
    }
}
