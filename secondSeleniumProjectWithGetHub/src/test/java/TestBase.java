import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Temps pour trouver l'action a effectuer
        OpenEbay();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    protected void SubmitLogin() {driver.findElementById("sgnBt").click();
    }

    protected void FillLoginForm() {
        driver.findElementById("userid").click();
        driver.findElementById("userid").clear();
        driver.findElementById("userid").sendKeys("testMickaelQA+1535360364679@gmail.com");

        driver.findElementById("pass").click();
        driver.findElementById("pass").clear();
        driver.findElementById("pass").sendKeys("telran55");


    }

    public void InitLogIn() {
        driver.findElementByLinkText("Sign in").click();
    }

    public void OpenEbay() {
        driver.get("https://www.ebay.com/");
    }

    public void NewUser() {
        driver.findElementByLinkText("register").click();
    }

    public void clickOnButtonSubReg() {
        driver.findElementById("ppaFormSbtBtn").click();
    }

    public void fillPassword() {
        driver.findElementById("PASSWORD").click();
        driver.findElementById("PASSWORD").clear();
        driver.findElementById("PASSWORD").sendKeys("telran55");
    }

    public void fillEmail() {
        driver.findElementById("email").click();
        driver.findElementById("email").clear();
        String email = "testMickaelQA+" + System.currentTimeMillis() +"@gmail.com";  //implementation en fonctio du temps
        driver.findElementById("email").sendKeys(email);
        System.out.println(email);
    }

    public void fillLastNameForm() {
        driver.findElementByName("lastname").click();
        driver.findElementByName("lastname").clear();
        driver.findElementByName("lastname").sendKeys("Test");
    }

    public void fillFirstNameForm() {
        driver.findElementByName("firstname").click();
        driver.findElementByName("firstname").clear();
        driver.findElementByName("firstname").sendKeys("Mickael");
    }
}
