package com.crystalkey.test;

import com.crystalkey.pages.MT_006_Page;
import com.crystalkey.utilities.ConfigReader;
import com.crystalkey.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MT_006_Tests {

    @Test
    public void test1(){
        MT_006_Page mt_006_page = new MT_006_Page();
        Driver.getDriver().get(ConfigReader.getProperty("c_url"));

        mt_006_page.ilkLogIn.click();
        mt_006_page.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        mt_006_page.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        mt_006_page.ikinciLoginButonu.click();
        mt_006_page.hotelmanagementButonu.click();
        mt_006_page.hotelRoomsButonu.click();
        mt_006_page.addHotelRoom.click();
    }

    @Test
    public void test2() throws InterruptedException {
        MT_006_Page mt_006_page =new MT_006_Page();
        WebElement idDropDown = Driver.getDriver().findElement(By.id("IDHotel"));
        Select select = new Select(idDropDown);
        select.selectByValue("1121");
        WebElement codeWebElementi = Driver.getDriver().findElement(By.id("code"));
        Actions actions = new Actions(Driver.getDriver());
        actions.click(codeWebElementi)
                .sendKeys("06100")
                .sendKeys(Keys.TAB)
                .sendKeys("Double with Child Room")
                .sendKeys(Keys.TAB)
                .sendKeys("Sydney")
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        Driver.getDriver().findElement(By.xpath("//textarea[@dir='ltr']")).sendKeys("Amazing Room");
        WebElement yediYuzButonu = Driver.getDriver().findElement(By.linkText("700"));
        Thread.sleep(5000);

        WebElement priceTextBox = Driver.getDriver().findElement(By.id("Price"));
        actions.dragAndDrop(yediYuzButonu, priceTextBox).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement roomTypeDropDown = Driver.getDriver().findElement(By.id("IDGroupRoomType"));
        Select select1 = new Select(roomTypeDropDown);
        select1.selectByIndex(5);

        Driver.getDriver().findElement(By.id("MaxAdultCount")).sendKeys("2");
        Driver.getDriver().findElement(By.id("MaxChildCount")).sendKeys("2");

        Driver.getDriver().findElement(By.id("btnSubmit")).click();
        Thread.sleep(5000);

        Assert.assertTrue(mt_006_page.sonucYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
