package com.qt.tests;

import java.io.IOException;

import com.qt.driverinit.DriverInit;
import com.qt.pom.LoginPage;
import com.qt.testdata.Data;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
    DriverInit driver=new DriverInit();

    @Given("user is launch the rentrola application {string}")
    public void user_is_launch_the_rentrola_application(String testCaseID) throws IOException {
        Data.readTestData(testCaseID);
       driver.launchApplication();
    }
    @When("enter the user name and password")
    public void enter_the_user_name_and_password() {
        LoginPage login=new LoginPage(driver.getCurrentDriver());
        login.clickPopUp();
        login.login();
    }
    @Then("user is able to login successfully")
    public void user_is_able_to_login_successfully() {

    	
    }

   
}
