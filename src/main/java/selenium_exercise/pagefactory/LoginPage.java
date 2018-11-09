package selenium_exercise.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='login.username']")
    private WebElement txtUsername;

    @FindBy(xpath = "//input[@name='login.password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement btnLogin;

    private static LoginPage loginPage;

    public boolean isLoaded() {
        return txtUsername.isDisplayed() && txtPassword.isDisplayed();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }

    public static LoginPage getInstance(WebDriver driver) {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    //Get the User name from Home Page
    public void loginWithUsernameAndPassword(String username, String password) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

}