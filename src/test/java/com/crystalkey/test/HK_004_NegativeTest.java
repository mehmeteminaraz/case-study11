package com.crystalkey.test;

import com.crystalkey.pages.HK_004_Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import com.crystalkey.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HK_004_NegativeTest {
    HK_004_Page hk004Page =new HK_004_Page();
    @Test
    public void negativeTestCase03() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        hk004Page.ilkLogin.click();
        hk004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        hk004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        hk004Page.loginKayit.click();
        hk004Page.hotelManagementButton.click();
        hk004Page.hotelListButton.click();
        Thread.sleep(4000);
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        hk004Page.searchButton.click();
        Thread.sleep(4000);
        hk004Page.detailButton.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        hk004Page.nameButton.clear();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        hk004Page.saveButton.click();
        Thread.sleep(4000);

        Assert.assertEquals(hk004Page.hataMessage.getText(), "Name");
        //Assert.assertTrue(us004Page.messageText.getText().contains("successfully"));
        //Assert.assertTrue(us004Page.messageText.isDisplayed());



    }


    @Test
    public void negativeTestCase04() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        hk004Page.ilkLogin.click();
        hk004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        hk004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        hk004Page.loginKayit.click();
        hk004Page.hotelManagementButton.click();
        hk004Page.hotelListButton.click();
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        hk004Page.searchButton.click();
        Thread.sleep(4000);
        hk004Page.detailButton.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        hk004Page.newAdresTextBox.clear();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        hk004Page.saveButton.click();

        Assert.assertTrue(hk004Page.hataMessage.getText().contains("Address"));


    }
    @Test
    public void negativeTestCase05() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        hk004Page.ilkLogin.click();
        hk004Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        hk004Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        hk004Page.loginKayit.click();
        hk004Page.hotelManagementButton.click();
        hk004Page.hotelListButton.click();
        hk004Page.codeButton.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        hk004Page.searchButton.click();
        Thread.sleep(4000);
        hk004Page.detailButton.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        hk004Page.newAdresTextBox.clear();
        hk004Page.phoneTextBox.clear();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        hk004Page.saveButton.click();

        Assert.assertTrue(hk004Page.hataMessage.isDisplayed());


    }

}
