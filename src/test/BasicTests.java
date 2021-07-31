package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicTests {
    @Test
    public void demo() {
        System.out.println("hellou");
    }

    @Test
    public void secondTest() {
        System.out.println("bye");
    }

    @AfterTest
    public void lastExecution() {
        System.out.println("I will execute last");
    }
}
