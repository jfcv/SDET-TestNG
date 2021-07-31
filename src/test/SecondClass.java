package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {

    @BeforeTest
    public void preRequisite() {
        System.out.println("I will execute first");
    }

    @Test
    public void thirdTest() {
        System.out.println("third test in a different class");
    }
}
