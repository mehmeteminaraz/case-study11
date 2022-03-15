package com.crystalkey.test;

import com.crystalkey.pages.AY_003_Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AY_003_NegativeTest {
    AY_003_Page ay003Page = new AY_003_Page();

    @Test
    public void negativeTestCase02() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        //ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.codeHataMesaji.getText().contains("Code"));

    }

    @Test
    public void negativeTestCase03() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        //ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.nameHataMesaji.getText().contains("Name"));

    }

    @Test
    public void negativeTestCase04() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        //ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.emailHataMesaji.getText().contains("Email"));

    }

    @Test
    public void negativeTestCase05() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        //ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.adresHataMesaji.getText().contains("Address"));

    }

    @Test
    public void negativeTestCase06() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        //Select select = new Select(ay003Page.dropDown);
        //select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.IDGroupHataMesaji.getText().contains("Select Group"));

    }
    @Test
    public void negativeTestCase07() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));
        SoftAssert softAssert = new SoftAssert();

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("invalidPhoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("emailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        softAssert.assertFalse(ay003Page.messageText.getText().contains("successfully"),"gecerli phone number girin hata mesajini gormeliyim");
        ay003Page.okButton.click();
        softAssert.assertAll();
    }

    @Test
    public void negativeTestCase08() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));
        SoftAssert softAssert = new SoftAssert();

        ay003Page.ilkLogin.click();
        ay003Page.usernameTextBox.sendKeys(ConfigReader.getProperty("usernameCrysHotel"));
        ay003Page.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordCrysHotel"));
        ay003Page.loginKayit.click();

        ay003Page.hotelManagementButton.click();
        ay003Page.hotelListButton.click();

        ay003Page.addHotelButton.click();
        ay003Page.codeTextBox.sendKeys(ConfigReader.getProperty("codeCrysHotel"));
        ay003Page.nameTextBox.sendKeys(ConfigReader.getProperty("nameCrysHotel"));
        ay003Page.addressTextBox.sendKeys(ConfigReader.getProperty("adressCrysHotel"));
        ay003Page.phoneTextBox.sendKeys(ConfigReader.getProperty("phoneCrysHotel"));
        ay003Page.emailTextBox.sendKeys(ConfigReader.getProperty("invalidEmailCrysHotel"));

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        softAssert.assertEquals(ay003Page.messageText.getText(), "Hotel could not be created");
        ay003Page.okButton.click();
        softAssert.assertAll();
    }
}
