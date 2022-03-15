package com.crystalkey.pages;

import com.crystalkey.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AO_US_005Page {

    public AO_US_005Page() {
        // PageFactory.initElements(Driver.getDriver(),this);
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Log in")
    public WebElement ck_login;

    @FindBy(id = "UserName")
    public WebElement ck_userTextBox;

    @FindBy(id = "Password")
    public WebElement ck_passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement ck_login2;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement ck_SystemManagementButon;

    @FindBy(linkText = "Hotel Management")
    public WebElement ck_HotelManagementButon;

    @FindBy(linkText = ("Hotel Rooms"))
    public WebElement ck_HotelRoomsButton;

    @FindBy(xpath = "//*[@class='hidden-480']")
    public WebElement ck_ADDHotelRommButton;

    @FindBy(xpath = "//*[@id='IDHotel']")
    public WebElement ck_IDHotelDropDown;

    @FindBy(id = "Code")
    public WebElement ck_CodeButon;

    @FindBy(id = "Name")
    public WebElement ck_Room_NameButon;

    @FindBy(id = "Location")
    public WebElement ck_LocationButon;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement ck_DescriptionButon;

    @FindBy(xpath = "(//a[@class='label label-success'])[3]")
    public WebElement ck_dortyuzbuton;

    @FindBy(id = "Price")
    public WebElement ck_priceTextBoxButton;

    @FindBy(id = "IDGroupRoomType")
    public WebElement ck_roomTypeDropDown;

    @FindBy(id = "MaxAdultCount")
    public WebElement ck_maxAdultButon;

    @FindBy(id = "MaxChildCount")
    public WebElement ck_maxChildButon;

    @FindBy(id = "IsAvailable")
    public WebElement ck_ApprovedRadioButon;

    @FindBy(id = "btnSubmit")
    public WebElement ck_saveButon;

    @FindBy(xpath = "//div[.='HotelRoom was inserted successfully']")
    public WebElement ck_success;

    @FindBy(xpath = "//label[@class='error']")
    public WebElement HataMesaji;

}
