package com.qt.pom;

import com.qt.testdata.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id='coiPage-1']/div[2]/button[2]") public WebElement pop;
   @FindBy(xpath="//input[@id='user_email']")public WebElement username;
    @FindBy(xpath ="//input[@id='user_password']")public WebElement password;
    @FindBy(xpath ="//input[@class='btn btn-primary']")public WebElement login;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(){
        try {
            username.sendKeys(Data.getData("UserName"));
            password.sendKeys(Data.getData("Password"));
            login.click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void clickPopUp(){
        try{
            pop.click();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
