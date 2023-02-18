import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class IndexPageTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    WebElement CloseModalButton;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/");
    }

    @Test(priority = 1)
    public void verifyTitleIsEqual() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Furniture, Home Decor, Rugs, Unique Gifts | World Market";
        assertEquals(ExpectedTitle, ActualTitle);
    }
    @Test(priority = 2)
    public void verifyThatCloseButtonIsDisplayed() {
        WebElement CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        assertTrue(CloseModalButton.isDisplayed());
    }  @Test(priority =3)
    public void verifyThatCloseButtonIsClickable() {
        CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
            BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        CloseModalButton.click();
    }

    @Test(priority = 4)
    public void verifyThatIndexPageIsOpenedSuccessfully() {
        WebElement imageSlider = driver.findElement(By.id("slider-container"));
        assertTrue(imageSlider.isDisplayed());
    }
    @Test(priority = 5)
    public void verifyThatDetailsButtonIsClickable() {
        WebElement DetailsButton = driver.findElement(By.id("gpsnonstore10details"));
//    BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        DetailsButton.click();
    }
    @Test(priority = 6)
    public void verifyDetailsModalIsClosed() {
        WebElement DetailsIsClosed = driver.findElement(By.xpath("//*[@id='cpwm-store10disclaimer']/button"));
//    BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        DetailsIsClosed.click();
    }
    @Test(priority = 7)
    public void verifyCoffeeTableCategoryIsClickable() {
        WebElement CoffeeTable = driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-3']/a"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CoffeeTable));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        CoffeeTable.click();
    }
    @Test(priority = 8)
    public void verifySearchBox() {
        WebElement searchInput = driver.findElement(By.id("navsearchbox"));
        searchInput.sendKeys("decor");
        // Clears the entered text
       // searchInput.clear();
    }
    @Test(priority = 9)
    public void verifySearchBtn() {
        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        searchBtn.click();
        // Clears the entered text
       // searchInput.clear();
}

    }


