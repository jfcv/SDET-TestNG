package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThirdClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am the first of us");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I will execute before every test method in ThirdClass.java");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I will execute after every test method in ThirdClass.java");
    }

    @Test
    public void webLoginHomeCarLoan() {
        System.out.println("webLoginHome");
    }

    @Test
    public void mobileLoginHomeCarLoan() {
        System.out.println("mobileLoginHome");
    }

    @Test
    public void mobileSignInHomeCarLoan() {
        System.out.println("mobileSignIn");
    }

    @Test
    public void mobileSignOutHomeCarLoan() {
        System.out.println("mobileSignOut");
    }

    @Test
    public void apiLoginHomeCarLoan() {
        System.out.println("apiLoginHome");
    }
}
