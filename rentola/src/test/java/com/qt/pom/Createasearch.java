package com.qt.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qt.testdata.Data;

public class Createasearch {
	
	
    WebDriver driver;
@FindBy(xpath="//*[@id=\"desktop-menu\"]/li[3]/a")public WebElement Createasearchbutton;
@FindBy(xpath="//*[@class='form-control string email required']")public WebElement sendemail;
@FindBy(xpath="//*[@class='form-control string required']")public WebElement sendfirstname;
@FindBy(xpath="//*[@id='geolocations-selectized']")public WebElement city;
@FindBy(xpath="//*[@value='6']")public WebElement rooms;
@FindBy(xpath="//*[@class='form-control string optional']")public WebElement rent;
@FindBy(xpath="//*[@value='room']")public WebElement propertytype;
@FindBy(xpath="//*[@class='form-control numeric integer optional']")public WebElement radius;
@FindBy(xpath="//*[@value='Register SearchAgent']")public WebElement registersearchagent;


public void CreateSearch(){
    try {
    
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void clickPopUp(){
    try{
    }catch(Exception e){
        e.printStackTrace();
    }

}

}
