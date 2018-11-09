package selenium_exercise.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium_exercise.pagefactory.HomePage;
import selenium_exercise.pagefactory.LoginPage;

public class TestLogin extends BaseFlowTest {

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setup() {
        homePage = HomePage.getInstance(driver);
        loginPage = LoginPage.getInstance(driver);

    }

    @Test
    public void testLoginWithValidUserAndValidPassword() throws Exception {
        homePage.getBtnHome().click();
        loginPage.isLoaded();
        loginPage.loginWithUsernameAndPassword("testuser@example.com", "test123");
    }
}
