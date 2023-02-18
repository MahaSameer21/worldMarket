import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class CoffeeTableCategoryTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    WebElement CloseModalButton;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/category/furniture/living-room/coffee-tables.do?ab=home:51:b:1:coffee-tables");
    }
    @Test(priority = 1)
    public void verifyTitleIsEqual() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Coffee Tables | World Market";
        assertEquals(ExpectedTitle, ActualTitle);
    }
    @Test(enabled = false)
    public void verifyThatCloseButtonIsDisplayed() {
        WebElement CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        assertTrue(CloseModalButton.isDisplayed());
    }  @Test(priority =3)
    public void verifyThatCloseButtonIsClickable() {
        CloseModalButton = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
       BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        CloseModalButton.click();
    }

@Test(enabled = false)
    public void verifyThatDropDownListIsClickable() {
        WebElement DropDown = driver.findElement(By.xpath("//form[@id='sortForm']/div[2]/select"));
    Select select = new Select(DropDown);
    select.selectByIndex(2);
//    select.selectByValue("/category/furniture/living-room/end-tables.do?pp=20&sortby=ourPicksAscend&sortType=1");
//    select.selectByVisibleText("New Arrivals");
    }
    @Test(priority =4)
    public void verifyThatCheckBoxIsClickable() {
        WebElement CheckBox = driver.findElement(By.xpath("//li[@id='spuf_0']/span"));
        CheckBox.click();
        boolean checked = CheckBox.isSelected();
        System.out.println(checked);
    }
}
