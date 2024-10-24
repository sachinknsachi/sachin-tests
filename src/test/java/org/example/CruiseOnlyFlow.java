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

    public static void main(String[] args) {

        File file = new File("D:\\Work\\Git\\SachinKn-tutorials\\sachin-tests\\test-output\\AutomationReport.html");

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(file);
        extentSparkReporter.config().setReportName("Odysseus Report");
        extentSparkReporter.config().setDocumentTitle("Odysseus Test Report");
        extentSparkReporter.config().setTheme(Theme.DARK);

        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        ExtentTest extentTest1 = extentReports.createTest("ODY-1");
        extentTest1.fail("Ody-1 passed");
        extentTest1.pass("Ody-1 fail");
        extentTest1.warning("Ody-1 warning");
        extentTest1.skip("Ody-1 skip");
        extentTest1.info("Ody-1 info");

        ExtentTest extentTest2 = extentReports.createTest("ODY-2");
        extentTest2.fail(MarkupHelper.createLabel("Ody-2 passed", ExtentColor.RED));
        extentTest2.pass(MarkupHelper.createLabel("Ody-2 fail", ExtentColor.GREEN));
        extentTest2.warning(MarkupHelper.createLabel("Ody-2 warning", ExtentColor.ORANGE));
        extentTest2.skip(MarkupHelper.createLabel("Ody-2 skip", ExtentColor.YELLOW));
        extentTest2.info(MarkupHelper.createLabel("Ody-2 info", ExtentColor.BROWN));

        String[][] data = {
                { "Name", "Age", "Place"},
                { "Sachin", "18", "Banglore"},
                { "Sanganna", "20", "Bagalkote"}
        };
        extentTest2.pass(MarkupHelper.createTable(data));

        extentReports.flush();

    }

}
