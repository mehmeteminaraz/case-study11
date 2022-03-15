package com.crystalkey.test;

import com.crystalkey.pages.AY_003_Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AY_003_PositiveTest {

    @Test
    public void positiveTestCese01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("urlCrysHotel"));

        AY_003_Page ay003Page = new AY_003_Page();

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

        Select select = new Select(ay003Page.dropDown);
        select.selectByValue(ConfigReader.getProperty("visibleText"));

        ay003Page.saveButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(ay003Page.messageText.getText().contains("successfully"));
        ay003Page.okButton.click();

    }
}
