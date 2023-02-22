import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
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
        driver=  baseTest.setUp("https://www.worldmarket.com");
        driver.manage().window().maximize();

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
    public void verifyVasesBtnIsDisplayed() {
        WebElement VasesBtn = driver.findElement(By.xpath("//a[@title='Shop Vases']"));
        assertTrue(VasesBtn.isDisplayed());
//        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(VasesBtn));
//        BaseTest.chromeDriver.manage().deleteAllCookies();
//        VasesBtn.click();
    }
    @Test(priority = 5)
    public void verifyVasesBtnIsClickable() {
        WebElement VasesBtn = driver.findElement(By.xpath("//a[@title='Shop Vases']"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(VasesBtn));
        VasesBtn.click();
    }
    @Test(enabled = false)
    public void verifyChooseOptionsButtonISClickable() {
        WebElement ChooseOptionsBtn = driver.findElement(By.xpath("//*[@id='ml_anchor_btn_448628']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(ChooseOptionsBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        ChooseOptionsBtn.click();
    }
    @Test(priority =6)
    public void verifyThatCloseModalButtonInVasesIsClickable() {
        CloseModalButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[6]/div/div/div/div[2]/div[3]/div/div/div[3]/div/button"));
//        CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        CloseModalButton.click();
    }

    @Test(priority =7)
    public void verifyThatImageItemInVasesIsClickable() {
        WebElement ImageItem = driver.findElement(By.xpath("//*[@id='ml-grid-view-items']/div[1]/div/div[1]/div[2]/div/a/img"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(ImageItem));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        ImageItem.click();
    }
    @Test(priority =8)
    public void verifyThatSizeSectionForItemIsDisplayed() {
        WebElement SizeSection = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[2]/span/form/div[2]/div/div[2]/div[11]/div/span/div[1]/div[1]/div/div[2]/fieldset"));
//        WebElement SizeSection = driver.findElement(By.xpath("\n" + "//*[@id='optionMenu_130916']/div/div[2]/fieldset"));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(SizeSection));
        assertTrue(SizeSection.isDisplayed());
    }
    @Test(priority =9)
    public void verifyThatSizeOptionForItemClickable() {
        WebElement SizeOption = driver.findElement(By.xpath("//input[@id='option_130916_100042_100930']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(SizeOption));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(SizeOption));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        SizeOption.click();
    }

    @Test(priority =10)
    public void verifyThatIncreaseQtyItemIsClickable() {
        WebElement IncreaseQty = driver.findElement(By.xpath("//form[@id='mainForm']/div[2]/div/div[2]/div[13]/div/div/div[2]/span[2]/div/div/span[2]/button/span"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(IncreaseQty));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(IncreaseQty));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        IncreaseQty.click();
    }
    @Test(priority =11)
    public void verifyThatApplyCodeIsClickable() {
        WebElement ApplyCodeBtn = driver.findElement(By.xpath("//input[@id='addToBasket130916']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(ApplyCodeBtn));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(ApplyCodeBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        ApplyCodeBtn.click();
    }
    @Test(priority =12)
    public void verifyThatAddToCartIsClickable() {
        WebElement AddToCartBtn = driver.findElement(By.xpath("//input[@id='addToBasket130916']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(AddToCartBtn));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(AddToCartBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        AddToCartBtn.click();
    }
    @Test(priority =13)
    public void verifyThatCheckoutIsClickable() {
        WebElement CheckoutBtn = driver.findElement(By.xpath("//button[@name='Checkout']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CheckoutBtn));
        BaseTest.wait.until(ExpectedConditions.visibilityOf(CheckoutBtn));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        CheckoutBtn.click();
    }
////img[@alt='Close'])[2]

}



