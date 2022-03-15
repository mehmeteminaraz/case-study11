package com.crystalkey.pages;

import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GG_005Pages {
    public GG_005Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilklogin;
    @FindBy(id = "UserName")
    public WebElement userNameTexBox;
    @FindBy(id = "Password")
    public WebElement passwordTextBox;
    @FindBy(id = "btnSubmit")
    public WebElement ikinciLoginButonu;
    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement HotelManagement;
    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoom;
    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelRoom;
    @FindBy(id = "IDHotel")
    public WebElement idHotel;
    @FindBy(id = "Code")
    public WebElement codeTextBox;
    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement description;
    @FindBy(linkText = "700")
    public WebElement miktar;
    @FindBy(id = "Price")
    public WebElement priceTextBox;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropDown;
    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCountTextBox;
    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCountTextBox;
    @FindBy(id = "IsAvailable")
    public WebElement isAvaible;
    @FindBy(id = "btnSubmit")
    public WebElement saveBotuno;
    @FindBy(xpath = "//*[text()='HotelRoom was inserted successfully']")
    public WebElement sonucYazisi;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButonu;



   public void login(){
       GG_005Pages roomCreation=new GG_005Pages();
       // Bir kullanici olarak crystalkeyhotels sitesine girin ...https://crystalkeyhotels.com/
       Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
       // Sag ustteki Login butonuna tiklayin
       roomCreation.ilklogin.click();
       // username butonuna valid bir username girin ...manager
       roomCreation.userNameTexBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
       // password butonuna valid password girin....Manager1!
       roomCreation.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
       // login Butonuna tiklayin
       roomCreation.ikinciLoginButonu.click();
       // Hotel management buttonuna tikayin
   }
public void addHotelGiris(){
       GG_005Pages roomCreation=new GG_005Pages();
    // Hotel management buttonuna tikayin
    roomCreation.HotelManagement.click();
    // Hotel Rooms Buttonuna tıklayın
    roomCreation.hotelRoom.click();
    // AddHotelRoom butonuna tıklayın
    roomCreation.addHotelRoom.click();
}



}








