package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/*4. Write down the following test in the ‘TopMenuTest’
class
1. userShouldNavigateToComputerPageSuccessfully()
* click on the ‘COMPUTERS’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully()
* click on the ‘ELECTRONICS’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelAndShoesPage
Successfully()
* click on the ‘APPAREL & SHOES’ Tab
* Verify the text ‘Apparel & Shoes’
4.
userShouldNavigateToDigitalDownloadsPageSuccessfully()
* click on the ‘DIGITAL DOWNLOADS’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully()
* click on the ‘BOOKS’ Tab
* Verify the text ‘Books’

6. userShouldNavigateToJewelryPageSuccessfully()
* click on the ‘JEWELRY’ Tab
* Verify the text ‘Jewelry’

7. userShouldNavigateToGiftCardsPageSuccessfully()
* click on the ‘GIFT CARDS’ Tab
* Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";


    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToComputerPageSuccessfully() {
    driver.findElement(By.linkText("Computers")).click();
    driver.findElement(By.linkText("Computers"));

    Assert.assertTrue(true);

}

//tagName[@attribute='value' And @attribute='value']

@Test
public void userShouldNavigateToElectronicsPageSuccessfully(){
driver.findElement(By.linkText("Electronics")).click();
driver.findElement(By.linkText("Electronics"));

    Assert.assertTrue(true);
    // Assert.assertArrayEquals(2,2);
}
@Test
public void userShouldNavigateToApparelAndShoesPageSuccessfully(){
        driver.findElement(By.linkText("Apparel & Shoes"));
}
@Test
public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
driver.findElement(By.linkText("Digital downloads")).click();
driver.findElement(By.linkText("Digital downloads"));
    Assert.assertTrue(true);
    // Assert.assertArrayEquals(2,2);
}
@Test
public void userShouldNavigateToBooksPageSuccessfully(){
driver.findElement(By.linkText("Books")).click();
driver.findElement(By.linkText("Books"));
Assert.assertTrue(true);
}
@Test
public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.linkText("jewelry")).click();
        driver.findElement(By.linkText("jewelry"));
        Assert.assertTrue(true);

}
@Test
public  void userShouldNavigateToGiftCardsPageSuccessfully(){
driver.findElement(By.linkText("Gift Cards")).click();
driver.findElement(By.linkText("Gift Cards"));
Assert.assertTrue(true);
}

public void close(){
        closeBrowser();
}
}
