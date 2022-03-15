package com.crystalkey.pages;

import com.crystalkey.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FK_CkHotelsHomePage {

    public FK_CkHotelsHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Log in")
    public WebElement ilkLogIn;

    @FindBy(id="UserName")
    public WebElement userNameTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girilemediYazisi;

}




















