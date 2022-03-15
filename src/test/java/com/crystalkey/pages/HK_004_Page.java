package com.crystalkey.pages;

import com.crystalkey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HK_004_Page {

    public HK_004_Page(){
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

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement codeButton;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@target='_blank']")
    public WebElement detailButton;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameButton;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//div[.='Hotel was updated successfully']")
    public WebElement messageText;

    @FindBy(id = "Address")
    public WebElement newAdresTextBox;

    @FindBy(xpath = "//label[@class='error']")
    public WebElement hataMessage;

    @FindBy(id = "Phone")
    public WebElement phoneTextBox;

    @FindBy(id = "btnDelete")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[.='Would you like to continue?']")
    public WebElement silmeOnayMesaji;

}

