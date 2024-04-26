package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

public class StudyMateLoginPage {

    public StudyMateLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//input[@name='email']")
    public WebElement userNameInputField;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    }


