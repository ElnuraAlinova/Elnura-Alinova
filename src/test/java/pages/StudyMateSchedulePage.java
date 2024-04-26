package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class StudyMateSchedulePage {


    public StudyMateSchedulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='email']")
    public WebElement usernameInput;
    @FindBy(xpath = "(//input)[2]")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[.='Schedule']")
    public WebElement scheduleButton;

    @FindBy(xpath = "//div[@class='MuiFormControl-root css-ccwj9y'][2]")
    public WebElement dropButton;

    @FindBy(xpath = "//li[.='Month']")
    public WebElement month;

    @FindBy(xpath = "//li[.='Day']")
    public WebElement day;

    @FindBy(xpath = "//li[.='Week']")
    public WebElement week;
}






