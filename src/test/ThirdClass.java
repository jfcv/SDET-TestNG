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

    @Parameters({"URL"})
    @Test(timeOut = 4000)
    public void webLoginHomeCarLoan(String url) {
        System.out.println("webLoginHome with the following url: " + url);
    }

    @Test(groups={"Smoke"}, dependsOnMethods = {"webLoginHomeCarLoan"})
    public void mobileLoginHomeCarLoan() {
        System.out.println("mobileLoginHome");
    }

    @Test(enabled = false)
    public void mobileSignInHomeCarLoan() {
        System.out.println("mobileSignIn");
    }

    @Test(dependsOnMethods = {"mobileLoginHomeCarLoan"})
    public void mobileSignOutHomeCarLoan() {
        System.out.println("mobileSignOut");
    }

    @Test(groups={"Smoke"}, dependsOnMethods = {"webLoginHomeCarLoan"})
    public void apiLoginHomeCarLoan() {
        System.out.println("apiLoginHome");
    }
}
