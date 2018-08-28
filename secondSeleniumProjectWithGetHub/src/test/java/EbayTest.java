import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayTest extends TestBase {

    @Test
    public void registrationTest (){


        NewUser();
        fillFirstNameForm();
        fillLastNameForm();
        fillEmail();
        fillPassword();
        clickOnButtonSubReg();




    }


}