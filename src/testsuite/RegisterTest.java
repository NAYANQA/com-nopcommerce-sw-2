package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.event.CaretListener;
import javax.swing.plaf.PanelUI;

public class RegisterTest extends BaseTest {

    String BaseURL = "https://demo.nopcommerce.com/";

    @Before
    public void Setup(){
        openBrowser(BaseURL);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

        //click on the ‘Register’ link

        WebElement ClcikRegister = driver.findElement(By.xpath("//a[@class='ico-register']"));
        ClcikRegister.click();



        //Verify the text ‘Register’

        WebElement VerifyText = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyText.getText();



    }
    @Test

    public void userSholdRegisterAccountSuccessfully(){

        //click on the ‘Register’ link
        WebElement ClcikRegister = driver.findElement(By.xpath("//a[@class='ico-register']"));
        ClcikRegister.click();



        //Select gender radio button

        WebElement RadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        RadioButton.click();




        //Enter First name
        WebElement EnterName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        EnterName.sendKeys("Testing");



        //Enter Last name
        WebElement EnterLName= driver.findElement(By.xpath("//input[@id='LastName']"));
        EnterLName.sendKeys("QA");

        // Select Day Month and Year



        //Enter Email address

        WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        EnterEmail.sendKeys("qa123456@gmail.com");

        //Enter Password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        EnterPassword.sendKeys("Test@123.");



        //Enter Confirm password

        WebElement EnterCPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        EnterCPassword.sendKeys("Test@123.");



        //Click on REGISTER button
        WebElement ClickRegister = driver.findElement(By.xpath("//button[@id='register-button']"));
        ClickRegister.click();



        //Verify the text 'Your registration completed’

        WebElement VerifyText = driver.findElement(By.xpath("//div[@class='result']"));
        VerifyText.getText();


    }

    @After
    public void tearDown() {
        //closeBrowser();
    }


}
