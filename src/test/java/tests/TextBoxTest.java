package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {
    private TextBoxPage textBoxPage;
    private HomePage homePage;

    @BeforeMethod
    public void initPages(){
        textBoxPage = new TextBoxPage(driver);
        homePage = new HomePage(driver);
        homePage.pressElement();
        textBoxPage.clickTextBoxTab();
    }

    @Test
    public void verifySuccessfulFormSubmission(){
        textBoxPage.enterUsername("David");
        textBoxPage.enterUserEmail("abc@gmail.com");
        textBoxPage.enterCurrentAddress("Methow Road, Victoria");
        textBoxPage.enterPermanentAddress("Alfrad house street, Colombo");

        textBoxPage.clickSubmit();
        WebElement actualData = this.driver.findElement(By.id("name"));

        Assert.assertEquals(actualData.getText(),"Name:David");
    }

    @Test
    public void verifyInvalidUserEmailSubmission(){
        textBoxPage.enterUserEmail("David");
        textBoxPage.clickSubmit();
    }

}
