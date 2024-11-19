package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    /*
    Project-1 - ProjectName : com-tricentis-sw-2
BaseUrl = https://demowebshop.tricentis.com/
1. Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘BaseTest’.
     */

public static WebDriver driver;

public  void openBrowser( String baseUrl){

    driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}

public void closeBrowser(){
driver.quit();
}

}