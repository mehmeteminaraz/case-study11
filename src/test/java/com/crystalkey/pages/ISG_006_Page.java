package com.crystalkey.pages;

import com.crystalkey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ISG_006_Page {
    public ISG_006_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[.='Log in']")
    public WebElement ilkLogin;

    @FindBy(id = "UserName")
    public WebElement usernameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement hotelReservation;

    @FindBy(xpath = "//span[.='Add Room Reservation ']")
    public WebElement addroomreservation;

    @FindBy(xpath = "//select[@name='IDUser']")
    public WebElement ilkDropDown;

    @FindBy(id = "IDHotelRoom")
    public WebElement selectHotelRoom;

    @FindBy(id = "Price")
    public WebElement priceTextBox;

    @FindBy(xpath = "//input[@name='DateStart']")
    public WebElement dateStart;

    @FindBy (xpath = "//input[@name='DateEnd']")
    public WebElement dateEnd;

    @FindBy(xpath = "//input[@name='AdultAmount']")
    public WebElement adultAmount;

    @FindBy(xpath = "//input[@name='ChildrenAmount']")
    public WebElement childrenAmount;

    @FindBy(xpath = "//input[@name='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy(xpath = "//input[@name='ContactPhone']")
    public WebElement contactPhone;

    @FindBy(xpath = "//input[@name='ContactEmail']")
    public WebElement contactEmail;

    @FindBy(xpath = "//input[@name='Notes']")
    public WebElement notesTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[.='RoomReservation was inserted successfully']")
    public WebElement messageText;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;


}




