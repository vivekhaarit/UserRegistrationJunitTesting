package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.Arrays;
import java.util.Collection;

public class UserRegistrationTest {
    private String phoneNo;
    private boolean expectedPhoneNOMatch;
    private UserRegistration userRegistration;

    @Before
    public void initialize(){
        UserRegistration userRegistration = new UserRegistration();
    }

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
    @Parameterized.Parameters
    public static Collection samplePhonNumbers(){
        return Arrays.asList(new Object[][] {
                {"9608583308",true},
                {"+91 9608583308",true},
                {"91 9608583308",true},
                {"67 9608583308",false},
                {"+56 9608583308",false},
                {"-56 9608583308",false}
        });
    }
    @Test
    public void testPhoneNumbers(){
        Assert.assertEquals(expectedPhoneNOMatch,userRegistration.phoneNumberValidation(phoneNo));
    }
   @Test
    public void passwordTest() {
        UserRegistration validate = new UserRegistration();
        boolean result = validate.passwordValidation("vivekkHAARIT567");
        Assert.assertTrue(result);
    }
}
