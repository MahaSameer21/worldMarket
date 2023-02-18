import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/account/login.do");
    }
    @Test(priority = 1)
    public void verifyThatJoinTabIsClickable() {
        WebElement JoinTab = driver.findElement(By.xpath("//*[@id='ml-body-container']/main/div/div/div/div/div[2]/ul/li[2]/a"));
//    BaseTest.wait.until(ExpectedConditions.elementToBeClickable(CloseModalButton));
        JoinTab.click();
    }
    @Test(priority = 2)
    public void verifyFormIsFilling(){
        WebElement FirstName= driver.findElement(By.xpath("//input[@id='create_firstName']"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(FirstName));
      WebElement LastName= driver.findElement(By.xpath("//input[@id='create_lastName']"));
        WebElement Email= driver.findElement(By.xpath("//input[@id='loginEmailCreateAccount']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='userPasswordCreate']"));
       WebElement MemberID= driver.findElement(By.xpath("//input[@id='memberIdInputCreateAccount']"));
        WebElement Month= driver.findElement(By.xpath("//select[@id='birthdayMonth']"));
        WebElement Day= driver.findElement(By.xpath("//select[@id='birthdayDay']"));
       WebElement ZipUSA= driver.findElement(By.xpath("//*[@id='postalCodeCreate']"));
       WebElement AcceptEmailSubscription= driver.findElement(By.xpath("//*[@id='createAccountOptInForEmail']"));
        WebElement CheckBoxAcceptConditions = driver.findElement(By.xpath("//*[@id='createAccountTandC']"));
        CheckBoxAcceptConditions.click();
        WebElement JoinNowBtn= driver.findElement(By.xpath("//form[@id='createAccountForm']/div[2]/div/button"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(JoinNowBtn));
        JoinNowBtn.click();
        FirstName.sendKeys(TestData.UserData.Fname);
      LastName.sendKeys(TestData.UserData.Lname);
        Email.sendKeys(TestData.UserData.Email);
        password.sendKeys(TestData.UserData.Password);
        MemberID.sendKeys(TestData.UserData.MemberId);
        Select selectM = new Select(Month);
            selectM.selectByValue("1");
            Select selectD = new Select(Day);
            selectD.selectByValue("1");
        ZipUSA.sendKeys(TestData.UserData.ZipUSA);
        boolean checkedAcceptEmailSubscription = AcceptEmailSubscription.isSelected();
        System.out.println(checkedAcceptEmailSubscription);
//        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(sendFormButton));
////        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(sendFormButton));
//        sendFormButton.click();
//        BaseTest.wait.until(ExpectedConditions.visibilityOf(successLabel));
//        Assert.assertEquals(successLabel.getText(),TestData.NewSpecialistData.successMessage);
    }
}
