package com.crystalkey.test;

import com.crystalkey.pages.AO_US_005Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AO_US_005NeagativeSenaryo02 {

    @Test
    public void codeButonuBosBirakilmasi() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ck_url"));

        AO_US_005Page ao_us_005Page=new AO_US_005Page();
        ao_us_005Page.ck_login.click();
        ao_us_005Page.ck_userTextBox.sendKeys(ConfigReader.getProperty("ck_valid_user"));
        ao_us_005Page.ck_passwordTextBox.sendKeys(ConfigReader.getProperty("ck_valid_pass"));
        ao_us_005Page.ck_login2.click();
        ao_us_005Page.ck_HotelManagementButon.click();
        ao_us_005Page.ck_HotelRoomsButton.click();
        ao_us_005Page.ck_ADDHotelRommButton.click();
        Select select=new Select(ao_us_005Page.ck_IDHotelDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("ck_hotelName"));

        // crsytalKeyHotelPage.ck_CodeButon.sendKeys(ConfigReader.getProperty("ck_invalid_code"));
        //ck_invalid_code=,!qasde233eglkfjdyhstdsgjyk anlamsiz bir ifade girilse bile oda olusturuluyor
        //yani invalid cod u yok

        ao_us_005Page.ck_Room_NameButon.sendKeys(ConfigReader.getProperty("ck_Room_Name"));
        ao_us_005Page.ck_LocationButon.sendKeys(ConfigReader.getProperty("ck_Location"));

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ao_us_005Page.ck_DescriptionButon.sendKeys(ConfigReader.getProperty("ck_Description"));

        actions.dragAndDrop(ao_us_005Page.ck_dortyuzbuton,ao_us_005Page.ck_priceTextBoxButton).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select1=new Select(ao_us_005Page.ck_roomTypeDropDown);
        select1.selectByVisibleText(ConfigReader.getProperty("ck_Room_Type"));

        ao_us_005Page.ck_maxAdultButon.sendKeys(ConfigReader.getProperty("ck_MaxAdult"));
        ao_us_005Page.ck_maxChildButon.sendKeys(ConfigReader.getProperty("ck_MaxChild"));
        ao_us_005Page.ck_ApprovedRadioButon.click();
        ao_us_005Page.ck_saveButon.click();
        Thread.sleep(5000);

        // Assert.assertEquals(crsytalKeyHotelPage.ck_success.getText(),"HotelRoom was inserted successfully");
        Assert.assertEquals(ao_us_005Page.HataMesaji.getText(),"Code");

        Driver.closeDriver();


    }
}
