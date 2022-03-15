package com.crystalkey.test;


import com.crystalkey.pages.GG_005Pages;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GG_005RoomCreation {


    @Test
    public void positiveTest() throws InterruptedException {
        GG_005Pages gg_005Pages = new GG_005Pages();

        gg_005Pages.login();
        gg_005Pages.addHotelGiris();
        //IDHotel dropdown’ına tıklayın ve bir otel secin....Cizgi Dusler Hotel
        gg_005Pages.idHotel.click();
        Thread.sleep(5000);
        Select select = new Select(gg_005Pages.idHotel);
        select.selectByValue("1027");
        // Code text box’ına rakamlardan olusan sayı girin..3900.
        gg_005Pages.codeTextBox.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(gg_005Pages.codeTextBox)
                .sendKeys("code_textBox")
                .sendKeys(Keys.TAB)
                // Name text box’ına bir isim girin.....Double
                .sendKeys(ConfigReader.getProperty("nameTextBox"))
                .sendKeys(Keys.TAB)
                // Location text box’ına ülke ismi girin.... Italy
                .sendKeys(ConfigReader.getProperty("LocationTextBox"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        // Description bolumune bir yazı yazın
        // Price textBox’ına rakamlardan olusan bir miktar girin....700
        gg_005Pages.priceTextBox.sendKeys(ConfigReader.getProperty("PriceTextBox"));
        gg_005Pages.priceTextBox.click();
        // Room Type dropdown’ından bir roomType secin.... Queen
        gg_005Pages.roomTypeDropDown.click();
        Select select1 = new Select(gg_005Pages.roomTypeDropDown);
        select1.selectByValue("318");
        // Max Adult TextBox’ına bir sayı girin.....1
        gg_005Pages.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("MaxAdultTextBox"));
        //Max Children TextBox’ına bir sayı girin...0
        gg_005Pages.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("MaxChildrenTextBox"));
        // Approved check box’ı isaretleyin
        gg_005Pages.isAvaible.click();
        // Save butonu tıklayın
        gg_005Pages.saveBotuno.click();
        //  Görüntülenen “HotelRoom was inserted successfully” yazısını onayla
        Thread.sleep(5000);
        Assert.assertEquals(gg_005Pages.sonucYazisi.getText(),"HotelRoom was inserted successfully");
        //Assert.assertTrue(roomCreation.sonucYazisi.isDisplayed());
        //ok butonuna basınız
        gg_005Pages.okButonu.click();



    }



}








