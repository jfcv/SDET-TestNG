package test;

import org.testng.annotations.*;

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

    @BeforeClass
    public void beforeClass() {
        System.out.println("before executing all the methods on the class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after executing all the methods on the class");
    }

    @Test
    public void webLoginHomeCarLoan() {
        System.out.println("webLoginHome");
    }

    @Test(groups={"Smoke"})
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

    @Test(groups={"Smoke"})
    public void apiLoginHomeCarLoan() {
        System.out.println("apiLoginHome");
    }
}
