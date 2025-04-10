package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]/div")
    private WebElement cardElementView;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]")
    private  WebElement cardFormView;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]")
    private WebElement expectedText;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[3]")
    private WebElement cardAlertView;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[4]")
    private WebElement cardWidgetView;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[5]")
    private WebElement cardInteractionView;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[6]")
    private WebElement bookStoreApplicationCardView;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressElement(){
        cardElementView.click();
    }

    public void pressForm(){
        cardFormView.click();
    }

    public void pressAlert(){
        cardAlertView.click();
    }

    public void pressWidget(){
        cardWidgetView.click();
    }

    public  void pressInterations(){
        cardInteractionView.click();
    }

    public void pressBookStoreApplication(){
        bookStoreApplicationCardView.click();
    }

    public void validateNavigation(){
        Assert.assertEquals(expectedText.getText(), "Please select an item from left to start practice.");
    }
}