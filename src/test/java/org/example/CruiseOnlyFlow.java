package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CruiseOnlyFlow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Work\\EXEs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
}
