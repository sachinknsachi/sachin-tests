package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;

public class CruiseOnlyFlow extends BaseTest {
    @Test(testName = "ODY-1 : Air Only Flow", dataProvider = "genericDataProvider")
    public void test_1(String name, WebdriverActions actions) {
        actions.openUrl("https://uat.odysol.com/swift/cruise?siid=130386");
    }

    @Test(testName = "ODY-2 : Cruise Only Flow", dataProvider = "genericDataProvider")
    public void cruiseOnlyFlow(String name, WebdriverActions actions) {
        System.out.println(name);
        actions.openUrl("https://uat.odysol.com/swift/cruise?siid=130385");
    }

}
