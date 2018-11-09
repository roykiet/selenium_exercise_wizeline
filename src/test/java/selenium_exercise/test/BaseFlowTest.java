package selenium_exercise.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class BaseFlowTest {

    static WebDriver driver;

    @BeforeTest
    public void setupTest() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        //Go to JIRA HomePage
        driver.get("http://testapp.galenframework.com");
    }

    @AfterSuite
    public void tearDownTest() {
        //Dispose driver
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
