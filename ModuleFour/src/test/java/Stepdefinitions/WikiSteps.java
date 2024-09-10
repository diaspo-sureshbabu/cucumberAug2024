package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WikiSteps {
    WebDriver driver;
    @Given("user navigates to wiki homepage")
    public void userNavigatesToWikiHomepage() {
        driver = new EdgeDriver();
        driver.get("https://en.wikipedia.org/wiki/Infosys");
    }

    @When("user extracts the shareholder value")
    public void userExtractsTheShareholderValue() {
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for (int k=0; k<size ; k++){
            String shareHolderValue=
                    driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println("shareholder value " + k + " : " + shareHolderValue);
        }
    }

    @And("user extracts the shareholding value")
    public void userExtractsTheShareholdingValue() {

        int shareHoldingSize = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for (int loop2=0; loop2<shareHoldingSize ; loop2++){
            String shareHolderingValue=
                    driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(loop2).getText();
            System.out.println("shareholding value " + loop2 + " : " + shareHolderingValue);
        }



     int acqSize = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).size();
        for (int loop3=0; loop3<acqSize ; loop3++){
            String acqValue = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).get(loop3).getText();
            System.out.println("Acquisition value of row  " + loop3 + " is : "  +  acqValue );
        }

    }

    @Then("validate the mapping")
    public void validateTheMapping() {
    }
}
