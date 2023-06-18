package com.qt.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProperties {
    WebDriver driver;
    
@FindBy(xpath="(//*[text()='Search properties'])[1]")public WebElement searchpropertiesbutton;
@FindBy(xpath="//*[@id='geolocations-selectized']")public WebElement location;
@FindBy(xpath="")public WebElement hyderabadlocation;
public SearchProperties(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver,this);
}
public void searchpropertiesbutton(){
    try{
    	searchpropertiesbutton.click();
    	location.sendKeys("hyderabad");
    	location.sendKeys(Keys.ENTER);
    	hyderabadlocation.click();
    	
    	
    }catch(Exception e){
        e.printStackTrace();
    }

}
}