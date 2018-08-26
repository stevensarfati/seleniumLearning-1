import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class EbayTest{
    ChromeDriver driver; //creer driver

    @Test
    public void setUp(){

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        openEbay();
        intitNewUserRegistration();
        fillFirstNameForm();
        fillLatsNameForm();
        fillEmailForm();
        fillPasswordForm();
        clickOnButtonSubmitRegistration();

        driver.quit();
    }

    public void openEbay() {
        driver.get("https://www.ebay.com/");
    }

    public void intitNewUserRegistration() {
        driver.findElement(By.linkText("register")).click();
    }

    //fill click on button
    public void clickOnButtonSubmitRegistration() {
        driver.findElement(By.id("ppaFormSbtBtn")).click();
    }

    // fill password field while registration
    public void fillPasswordForm() {
        driver.findElement(By.id("PASSWORD")).click();
        driver.findElement(By.id("PASSWORD")).clear();
        driver.findElement(By.id("PASSWORD")).sendKeys("D4C3B2A1a1b2c3d4");
    }

    // fill email field while registration
    public void fillEmailForm() {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("bouchadpinto.david@outlook.com");
    }

    // fill lastname field while registration
    public void fillLatsNameForm() {
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Pinto");
    }

    // fill firstname field while registration
    public void fillFirstNameForm() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("David");
    }


}
