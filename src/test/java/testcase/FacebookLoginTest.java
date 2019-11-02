package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FacebookLoginPage;

public class FacebookLoginTest extends TestBase {

    @Test
    public void init() throws Exception {

        driver.get("https://www.facebook.com/");
        FacebookLoginPage loginpage =
                PageFactory.initElements(driver,
                        FacebookLoginPage.class);

        loginpage.setEmail("abc@gmail.com");
        loginpage.setPassword("1234");
        loginpage.loginButtion();
    }
}
