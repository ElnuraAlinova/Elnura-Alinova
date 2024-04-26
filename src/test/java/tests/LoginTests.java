package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudyMateLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.Duration;

public class LoginTests {
    StudyMateLoginPage studyMateLoginPage = new StudyMateLoginPage();


    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getProperty("studymateUrl"));

    }

    @Test
    public void successfulLogin() {
        studyMateLoginPage.userNameInputField.sendKeys(Config.getProperty("studymateUsername"));
        studyMateLoginPage.passwordInputField.sendKeys(Config.getProperty("studymatePassword"));
        studyMateLoginPage.loginButton.click();

        SeleniumUtils.waitForSeconds(10);

        String expectedUrlAfterLogin = Config.getProperty("scheduleUrl");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrlAfterLogin, "Url after login is not as expected");

    }

    @AfterMethod
    public void CleanUp(){
        Driver.getDriver().quit();
    }

    }



    







