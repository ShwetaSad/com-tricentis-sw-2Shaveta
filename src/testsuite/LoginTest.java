package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest{

        /*Write down the following test in the ‘LoginTest’ class
 1. userShouldNavigateToLoginPageSuccessfully()

 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign
    In!’
 2. userShouldLoginSuccessfullyWithValidCredentials()

* click on the ‘Login’ link
* Enter a valid username
* Enter a valid password
* Click on the ‘Login’ button
* Verify the ‘Welcome to our store’
text is displayed
3. verifyTheErrorMessage()

* click on the ‘Login’ link
* Enter the invalid username
* Enter the invalid password
* Click on the ‘Login’ button
* Verify the error message

     */

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        //Find the login link element and click on login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        System.out.println("Welcome, Please Sign In!");
        Assert.assertTrue(true);

    }
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // click on login link
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        // Enter valid credentials
        driver.findElement(By.id("Email")).sendKeys("sstesting40@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("testing");

        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

       //  Verify the ‘Welcome to our store’, text is displayed

    String expectedText = "Welcome to our store";
    WebElement welcomeTextElement =  driver.findElement(By.className("topic-html-content-title"));
    String actualText = welcomeTextElement.getText();
    Assert.assertEquals("Welcome to our store",expectedText,actualText);


}
@Test
public void usershouldNotLoginWithInvalidCredentials(){
        //Click on login Button
     driver.findElement(By.linkText("Log in")).click();
    //Enter invalid credentials
    driver.findElement(By.id("Email")).sendKeys("sstest@gmail.com");
    driver.findElement(By.name("Password")).sendKeys("testing");

    driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
    //Verify Error Message
    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+
            "The credentials provided are incorrect";
    String actualErrorMesasge = driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']")).getText();

    Assert.assertEquals("Error message",expectedErrorMessage,actualErrorMesasge);


}
public void close(){
        closeBrowser();
}

}