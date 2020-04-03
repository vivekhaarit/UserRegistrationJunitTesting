package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidatorTest {
    private String email;
    private boolean expectedResult;
    private UserRegistration validate;

    public EmailValidatorTest(String email, boolean expectedResult){
        this.email=email;
        this.expectedResult=expectedResult;
    }
    @Before
    public void initialize(){
        validate = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {
                {"vivekhaarit@gmail.com",true},
                {"adfgsdgfdgg@gmail.com",true},
        });
    }
    @Test
    public void emailTest() {
        Assert.assertEquals(expectedResult,validate.emailValidation(email));
    }
}
