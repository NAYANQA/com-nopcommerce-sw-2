package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
   public void userShouldNavigateToLoginPageSuccessfully(){
        // click on the ‘Login’ link

        WebElement loginClick =  driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginClick.click();
        System.out.println("User is able to click on Login button");

        // Verify the text ‘Welcome, Please Sign In!’
           WebElement VeryfyTheText= driver.findElement(By.xpath("//div[@class='page-title']"));
            VeryfyTheText.getText();
        System.out.println("Test is verify");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on the ‘Login’ link

        WebElement ClickOnLogin =driver.findElement(By.xpath("//a[@class='ico-login']"));
        ClickOnLogin.click();



        //Enter valid username

        WebElement ValidUsername = driver.findElement(By.xpath("//input[@class='email']"));
        ValidUsername.sendKeys("test123@gmail.com");


        //Enter valid password
        WebElement ValidPassword = driver.findElement(By.xpath("//input[@class='password']"));
        ValidPassword.sendKeys("Test@123.");

        //Click on ‘LOGIN’ button
        WebElement ClickLogin = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickLogin.click();


        //Verify the ‘Log out’ text is display

        WebElement LogOutTest = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        LogOutTest.getText();


        System.out.println("Test Done");


    }

    @Test

            public void verifyTheErrorMessage() {

        //click on the ‘Login’ link

        WebElement ClickLogin = driver.findElement(By.xpath("//a[@class='ico-login']"));
        ClickLogin.click();

        //Enter invalid username

        WebElement IvalidUSername = driver.findElement(By.xpath("//input[@class='email']"));
        IvalidUSername.sendKeys("wrong@gmai");


        //Enter invalid password
        WebElement IvalidPassword = driver.findElement(By.xpath("//input[@class='password']"));
        IvalidPassword.sendKeys("123456789");

        //Click on Login button
        WebElement ClickLoginn = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        ClickLoginn.click();


        //Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’
        WebElement verifyText=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText= verifyText.getText();
        String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //validtion
        Assert.assertEquals(expectedText,actualText);

        System.out.println("Weel done");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}