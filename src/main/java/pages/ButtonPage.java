package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {
    private WebDriver driver;
    private Actions actions;

    @FindBy(id = "item-4")
    private WebElement buttonTab;

    @FindBy(id = "doubleClickBtn")
    private WebElement btnDoubleClick;

    @FindBy(id = "rightClickBtn")
    private WebElement btnRightClick;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")
    private WebElement btnClick;

    public ButtonPage(WebDriver driver){
        this.actions = new Actions(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonTab(){
        buttonTab.click();
    }


    public void clickButton(){
        btnClick.click();
    }

    public void doubleClickButton(){
        actions.doubleClick(btnDoubleClick).perform();
    }

    public void rightClickButton(){
        actions.contextClick(btnRightClick).perform();
    }
}
