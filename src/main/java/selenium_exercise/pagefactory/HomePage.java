package selenium_exercise.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObject {

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement btnLogin;

    private static HomePage homePage;

    public boolean isLoaded() {
        return btnLogin.isDisplayed();
    }

    public HomePage(WebDriver driver) {
        super(driver);
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public static HomePage getInstance(WebDriver driver) {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }
    
    public WebElement getBtnHome() {
        return btnLogin;
    }
    
}