package com.crystalkey.test;


import com.crystalkey.pages.ISG_006_Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ISG_006_Test {


    @Test
    public void positoveTestCase01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url_CrysHotel"));

        Actions actions = new Actions(Driver.getDriver());

        ISG_006_Page hotel_page = new ISG_006_Page();

        hotel_page.ilkLogin.click();
        hotel_page.usernameTextBox.sendKeys(ConfigReader.getProperty("username_CrysHotel"));
        hotel_page.passwordTextBox.sendKeys(ConfigReader.getProperty("password_CrysHotel"));
        hotel_page.loginButton.click();
        hotel_page.hotelManagementButton.click();
        hotel_page.hotelReservation.click();
        hotel_page.addroomreservation.click();

        Thread.sleep(4000);

        Select select = new Select(hotel_page.ilkDropDown);
        select.selectByValue(ConfigReader.getProperty("Iduservalue"));

        Select select1 = new Select(hotel_page.selectHotelRoom);
        select1.selectByValue("28");

        hotel_page.priceTextBox.sendKeys(ConfigReader.getProperty("price"));
        hotel_page.dateStart.sendKeys(ConfigReader.getProperty("girisTarih"));
        hotel_page.dateEnd.sendKeys(ConfigReader.getProperty("bitisTarihi"));
        hotel_page.adultAmount.sendKeys(ConfigReader.getProperty("adultAmount"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotel_page.childrenAmount.sendKeys(ConfigReader.getProperty("childrenAmount"));
        hotel_page.contactNameSurname.sendKeys(ConfigReader.getProperty("contactNameSurname"));
        Thread.sleep(3000);
        hotel_page.contactPhone.sendKeys(ConfigReader.getProperty("contactPhone"));
        hotel_page.contactEmail.sendKeys(ConfigReader.getProperty("contactEmail"));
        hotel_page.notesTextBox.sendKeys(ConfigReader.getProperty("notesTextBox"));

        hotel_page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(hotel_page.messageText.isDisplayed());

        hotel_page.okButton.click();


    }


}

