package selenium_exercise.pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.WaitingHandler;

public class PageObject {

    WebDriver driver;
    public Actions actions;
    public WaitingHandler waitingHandler;

    private static final String XPATH_FIND_BUTTON = "//button[text()='%s']";

    public PageObject(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        waitingHandler = WaitingHandler.getInstance(driver, 50);
    }

    public void clickButton(String btnName) {
        this.driver.findElement(By.xpath(String.format(XPATH_FIND_BUTTON, btnName))).click();
    }

    public void clickLink(String linkText) {
        this.driver.findElement(By.linkText(linkText)).click();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}