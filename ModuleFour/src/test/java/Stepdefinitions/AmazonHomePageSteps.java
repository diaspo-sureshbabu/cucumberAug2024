package Stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageSteps {

    WebDriver driver;
 @Given("user navigates to amazon homepage")
     public void homePage(){
     driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");

 }

 @And("user clicks the search icon")
    public void searchIcon(){
     ////input[@id='nav-search-submit-button']
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


    }

 @When("user enter the product name {string}")
    public void enterProductName(String prodName){
     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(prodName);
    }

 @Then("user verify the title of  page")
    public void validateTitle(){
     System.out.println(driver.getTitle());
     driver.close();
     }


    @When("user extracts all the values")
    public void userExtractsAllTheValues() {
     WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));

    }
}
