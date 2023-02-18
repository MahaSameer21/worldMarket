import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ModalTest {
    BaseTest baseTest= new BaseTest();
    public static ChromeDriver driver;
   public static WebElement CloseModalButton;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/product/clear-barcelona-vases.do?sortby=ourPicks&from=fn");
        driver.manage().window().maximize();

    }
//    @Test(priority = 1)
//    public static void ModalIsDisplayed() {
//        WebElement CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
//        assertTrue(CloseModalButton.isDisplayed());
//    }  @Test(priority =2)
//    public static void ModalIsClickable() {
//        CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
//        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
//        CloseModalButton.click();
//    }
    @Test(priority =3)
    public void verifyThatIncreaseQtyItemIsClickable() {
        WebElement IncreaseQty = driver.findElement(By.xpath("//form[@id='mainForm']/div[2]/div/div[2]/div[13]/div/div/div[2]/span[2]/div/div/span[2]/button/span"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(IncreaseQty));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        IncreaseQty.click();
    }
}
