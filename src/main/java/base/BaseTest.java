package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(
                    "--start-maximized",
                    "--remote-allow-origins=*",
                    "--disable-popup-blocking",
                    "--ignore-certificate-errors",
                    "--remote-allow-origins=*");
            chromeOptions.setAcceptInsecureCerts(true);
            driver = new ChromeDriver(chromeOptions);
            driver.get("https://demoqa.com/");
        }
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null)
            driver.quit();
    }
}

