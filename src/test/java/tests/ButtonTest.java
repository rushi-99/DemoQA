package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ButtonPage;
import pages.HomePage;

public class ButtonTest extends BaseTest {
    private ButtonPage buttonPage;
    private HomePage homePage;

    @BeforeMethod
    public void initPage() throws InterruptedException {
        homePage = new HomePage(driver);
        buttonPage = new ButtonPage(driver);
        homePage.pressElement();
        buttonPage.clickButtonTab();
    }

    @Test
    public void verifyButtonClick(){
        buttonPage.clickButton();
        WebElement actualData = this.driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertEquals(actualData.getText(), "You have done a dynamic click");
    }

    @Test
    public void verifyButtonDoubleClick(){
        buttonPage.doubleClickButton();
        WebElement actualData = this.driver.findElement(By.id("doubleClickMessage"));
        Assert.assertEquals(actualData.getText(), "You have done a double click");
    }

    @Test
    public void verifyRightButtonClick(){
        buttonPage.rightClickButton();
        WebElement actualData = this.driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals(actualData.getText(), "You have done a right click");
    }
}
