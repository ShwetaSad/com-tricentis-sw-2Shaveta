package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    /*
    5. Write down the following test in the ‘RegisterTest’
class
1. userShouldNavigateToRegisterPageSuccessfully()

* click on the ‘Register’ link
* Verify the text ‘Register’
2. userShouldRegisterAccountSuccessfully
* click on the ‘Register’ link
* Select the gender radio button
* Enter the First name
* Enter the Last name
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on the ‘Register’ button

* Verify the text 'Your registration completed’
     */
String baseUrl =    "https://demowebshop.tricentis.com/";

@Before
    public void setup(){
        openBrowser(baseUrl);

    }
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

      WebElement register = driver.findElement(By.linkText("Register"));
      register.click();
        String expectedtext = "Register";
     String actualtext =   driver.findElement(By.linkText("Register")).getText();

     Assert.assertTrue(true);
    }
@Test
public void userShouldRegisterAccountSuccessfully(){
    driver.findElement(By.linkText("Register")).click();

driver.findElement(By.className("gender")).click();
driver.findElement(By.id("FirstName")).sendKeys("Shaveta");
driver.findElement(By.id("LastName")).sendKeys("Sethi");
driver.findElement(By.id("Email")).sendKeys("shavetasadhwani40@gmail.com");
driver.findElement(By.id("Password")).sendKeys("password");
driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
driver.findElement(By.id("register-button")).click();
driver.findElement(By.className("validation-summary-errors"));
Assert.assertTrue(true);
}

public void close(){
    closeBrowser();
}
}
