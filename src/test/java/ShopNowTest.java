import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class ShopNowTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    WebElement CloseModalButton;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/");
    }

    @Test(enabled = false)
    public void verifyThatCloseButtonIsDisplayed() {
        WebElement CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        assertTrue(CloseModalButton.isDisplayed());
    }  @Test(priority =2)
    public void verifyThatCloseButtonIsClickable() {
        CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        CloseModalButton.click();
    }
    @Test(priority = 3)
    public void verifyShopNowISClickable() {
        WebElement ShopNowBtn = driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-7']/a"));
           BaseTest.wait.until(ExpectedConditions.elementToBeClickable(ShopNowBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        ShopNowBtn.click();
    }
    @Test(priority = 4)
    public void verifyChooseOptionsButtonISClickable() {
        WebElement ChooseOptionsBtn = driver.findElement(By.xpath("//*[@id='ml_anchor_btn_448628']"));
           BaseTest.wait.until(ExpectedConditions.elementToBeClickable(ChooseOptionsBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        ChooseOptionsBtn.click();
    }
    @Test(priority = 4)
    public void verifyIncreaseButtonISCDisplay() {
        WebElement IncreaseBtn = driver.findElement(By.xpath(  "//div[@id='home_topnav_layout_15_fillslot-7']/a/div"));
       assertTrue(IncreaseBtn.isDisplayed());
    }


}
