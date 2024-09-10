package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceHomePageSteps {

    @Given("user navigates to salesforce login page")
    public void salesforceHomepage(){

    }
    @When("user enter the username {string} and Password {string}")
    public void enterLoginCredentials(String strUsername, String StrPassword ){

    }

    @And("user click the login button")
    public void clickLoginBtn (){

    }
    @Then("user validate the navigation to the home page")
    public void homePageValidation(){

    }
    @Then("user validate the error message")
    public void validatingErrMessage(){

    }





}
