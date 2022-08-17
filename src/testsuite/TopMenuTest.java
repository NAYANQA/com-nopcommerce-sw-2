package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String BasURL = "https://demo.nopcommerce.com/";

    @Before

    public void setUp(){

        openBrowser(BasURL);

    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully(){

        //* click on the ‘Computers’ Tab

        WebElement ClickCoputers = driver.findElement(By.linkText("Computers"));
        ClickCoputers.click();

        //* Verify the text ‘Computers’

        WebElement VerifyComputers = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyComputers.getText();


    }
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

       //* click on the ‘Electronics’ Tab
        WebElement ClickElectronics = driver.findElement(By.linkText("Electronics"));
        ClickElectronics.click();



        //* Verify the text ‘Electronics’

        WebElement VerifyElectronics = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyElectronics.getText();

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //* click on the ‘Apparel’ Tab

        WebElement ClickApparel = driver.findElement(By.linkText("Apparel"));
        ClickApparel.click();

        //* Verify the text ‘Apparel’

        WebElement VerifyApparel = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyApparel.getText();


    }
@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //* click on the ‘Digital downloads’ Tab

        WebElement ClickDigitaldownloads = driver.findElement(By.linkText("Digital downloads"));
        ClickDigitaldownloads.click();

        //* Verify the text ‘Digital downloads’

        WebElement VerifyDigitaldownloads = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyDigitaldownloads.getText();



    }
@Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //* click on the ‘Books’ Tab

        WebElement ClickBooks = driver.findElement(By.linkText("Books"));
        ClickBooks.click();

        //* Verify the text ‘Books’

        WebElement VerifyBooks = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyBooks.getText();


    }
@Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //* click on the ‘Jewelry’ Tab

        WebElement ClickJewelry = driver.findElement(By.linkText("Jewelry"));
        ClickJewelry.click();

        //* Verify the text ‘Jewelry’


        WebElement VerifyJewelry = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyJewelry.getText();

    }
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //* click on the ‘Gift Cards’ Tab

        WebElement ClickGiftCards = driver.findElement(By.linkText("Gift Cards"));
        ClickGiftCards.click();


        //* Verify the text ‘Gift Cards’


        WebElement VerifyGiftCards = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyGiftCards.getText();

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }


}
