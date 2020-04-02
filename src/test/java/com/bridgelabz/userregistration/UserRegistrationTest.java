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
}
