package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.StudyMateLoginPage;
import pages.StudyMateSchedulePage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.Duration;

public class ScheduleTests {

    StudyMateSchedulePage studyMateSchedulePage = new StudyMateSchedulePage();


    @BeforeTest
    public void initialize(){
        Driver.getDriver().get(Config.getProperty("studymateUrl"));
        studyMateSchedulePage.usernameInput.sendKeys("alinova94@gmail.com");
        studyMateSchedulePage.passwordInput.sendKeys("Live328996.//");
        studyMateSchedulePage.loginBtn.click();

    }
    @Test (priority = 4)
    public void TestMonth(){
        studyMateSchedulePage.scheduleButton.click();
        studyMateSchedulePage.dropButton.click();


    }

    @Test (priority = 1)
    public void ClickMonth(){
        studyMateSchedulePage.scheduleButton.click();
        studyMateSchedulePage.dropButton.click();
        studyMateSchedulePage.month.click();

    }

    @Test (priority = 2)
    public void ClickWeek(){
        studyMateSchedulePage.scheduleButton.click();
        studyMateSchedulePage.dropButton.click();
        studyMateSchedulePage.week.click();

    }

    @Test (priority = 3)
    public void ClickDay(){
        studyMateSchedulePage.scheduleButton.click();
        studyMateSchedulePage.dropButton.click();
        studyMateSchedulePage.day.click();
    }
    @AfterTest
    public void CleanUP(){
        Driver.getDriver().quit();
    }




}
