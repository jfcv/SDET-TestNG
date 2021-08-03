package test;

import org.testng.Assert;
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

    @Parameters({"URL", "APIKey"})
    @Test(timeOut = 4000)
    public void webLoginHomeCarLoan(String url, String apiKey) {
        System.out.println("webLoginHome with the following url: " + url + " and the following API Key: " + apiKey);
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

    /*
     * no matter how many arguments are in the data provider
     * when processing the information it receives just the two
     * of the parameters at each row
     */
    @Test(dependsOnMethods = {"mobileSignOutHomeCarLoan"}, dataProvider = "getData")
    public void dataProvidersTest(String username, String password) {
        System.out.println("the username is : " + username + " and the password is : " + password);
    }

    @Test(dependsOnMethods = {"dataProvidersTest"})
    public void onTestFailedListenersTest() {
        Assert.assertTrue(false);
    }

    @DataProvider
    public Object[][] getData(){
        /*
         * Object[# combinations][# values]
         */
        Object[][] data = new Object[3][2];
        /*
         * 1st set
         */
        data[0][0] = "firstUsername";
        data[0][1] = "firstPassword";
        /*
         * 2nd set
         */
        data[1][0] = "secondUsername";
        data[1][1] = "secondPassword";
        /*
         * 3rd set
         */
        data[2][0] = "thirdUsername";
        data[2][1] = "thirdPassword";
        return data;
    }
}
