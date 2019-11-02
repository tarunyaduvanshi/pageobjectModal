package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FaceBookDashBoardPage;
import pages.FacebookLoginPage;

public class FacebookDashBoardPageTest extends  TestBase{

    @Test
    public void init() throws Exception {

        driver.get("https://www.facebook.com/");
        FacebookLoginPage loginpage =
                PageFactory.initElements(driver,
                        FacebookLoginPage.class);

        loginpage.setEmail("abc@gmail.com");
        loginpage.setPassword("1234");
        loginpage.loginButtion();

        FaceBookDashBoardPage faceBookDashBoardPage = PageFactory.initElements(driver,
                FaceBookDashBoardPage.class);
    }
}

