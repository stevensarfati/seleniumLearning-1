import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginEbayTest extends TestBase {

    @Test
    public void EbayLoginTest(){


        InitLogIn();
        FillLoginForm();  // Cree une methode pour remplir les cases seuls
        SubmitLogin();

    }


}