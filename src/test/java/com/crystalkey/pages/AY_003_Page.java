package com.crystalkey.pages;


import com.crystalkey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AY_003_Page {

    public AY_003_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Log in']")
    public WebElement ilkLogin;

    @FindBy(id = "UserName")
    public WebElement usernameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginKayit;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListButton;

    @FindBy(xpath = "//span[.='Add Hotel ']")
    public WebElement addHotelButton;

    @FindBy(id = "Code")
    public WebElement codeTextBox;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//select[@name='IDGroup']")
    public WebElement dropDown;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[.='Hotel was inserted successfully']")
    public WebElement messageText;

    @FindBy(xpath = "//button[.='OK']")
    public  WebElement okButton;

    @FindBy(xpath = "//td[.='A1B2C3']")
    public WebElement hotelDogrulama;

    @FindBy(xpath = "//label[@for='Code']")
    public WebElement codeHataMesaji;

    @FindBy(xpath = "//label[@for='Name']")
    public WebElement nameHataMesaji;

    @FindBy(xpath = "//label[@for='Email']")
    public WebElement emailHataMesaji;

    @FindBy(xpath = "//label[@for='Address']")
    public WebElement adresHataMesaji;

    @FindBy(xpath = "//label[@for='IDGroup']")
    public WebElement IDGroupHataMesaji;


}

