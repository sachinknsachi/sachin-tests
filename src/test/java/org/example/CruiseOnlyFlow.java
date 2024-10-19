package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CruiseOnlyFlow extends BaseTest {
    @Test
    public void test_1() {
        System.out.println("This is test_1()");

        WebDriver driver = new ChromeDriver();
        WebdriverActions actions = new WebdriverActions(driver);

        actions.openUrl("https://uat.odysol.com/swift/cruise?siid=130386");
    }

    @Test
    public void test_2() {
        System.out.println("This is test_2()");

        WebDriver driver = new ChromeDriver();
        WebdriverActions actions = new WebdriverActions(driver);

        actions.openUrl("https://uat.odysol.com/swift/cruise?siid=130385");
    }
}
