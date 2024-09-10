package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;



public class FindElementCar {
    public static void main(String[] args)  {

        // WebDriver driverFirefox = new FirefoxDriver();
        WebDriver driverFirefox = new ChromeDriver();
        String baseUrl = "https://testing.alfred.ae/car-insurance/get-quote/";
        driverFirefox.get(baseUrl);
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //finding car model element and entering value
        driverFirefox.findElement(By.id("carModelId-input")).sendKeys("Tata");
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("carModelId-details-item-0")).click();

        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:R35lakl7rrqba:")).sendKeys("2024");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:R35lakl7rrqba:")).sendKeys(     Keys.ENTER);

        //fullName
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.name("fullName")).sendKeys("Ramesh kumarthree");

        //Nationality
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rp95ekl7rrqba:")).sendKeys("Indian");
        String nationalityStr = driverFirefox.findElement(By.id("headlessui-combobox-input-:Rp95ekl7rrqba:")).getText();
        System.out.println(nationalityStr);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rp95ekl7rrqba:")).sendKeys(Keys.ENTER);

        //day  id = headlessui-combobox-input-:Rcl9lekl7rrqba:
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcl9lekl7rrqba:")).sendKeys("1");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcl9lekl7rrqba:")).sendKeys(Keys.ENTER);

        // month id = headlessui-combobox-input-:Rcm9lekl7rrqba:
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcm9lekl7rrqba:")).sendKeys("August");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcm9lekl7rrqba:")).sendKeys(Keys.ENTER);


        //year id headlessui-combobox-input-:Rcn9lekl7rrqba:
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcn9lekl7rrqba:")).sendKeys("1995");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rcn9lekl7rrqba:")).sendKeys(Keys.ENTER);

        // email name = email
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.name("email")).sendKeys("diaspo.testaug2@yopmail.com");
        driverFirefox.findElement(By.name("email")).sendKeys(Keys.RETURN);

        // phone name = mobileNo
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.name("mobileNo")).sendKeys("888999892");
        driverFirefox.findElement(By.name("mobileNo")).sendKeys(Keys.RETURN);

        //emirate of registration id = headlessui-combobox-input-:Rpb5ekl7rrqba:
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rpb5ekl7rrqba:")).sendKeys("Ajman");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rpb5ekl7rrqba:")).sendKeys(Keys.RETURN);

        // uae license hold for id = headlessui-combobox-input-:Rpblekl7rrqba:
        driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rpblekl7rrqba:")).sendKeys("2 years");
        driverFirefox.findElement(By.id("headlessui-combobox-input-:Rpblekl7rrqba:")).sendKeys(Keys.RETURN);

        // view quotes button  xpath =   //span[contains(text(),'View quotes')]


        driverFirefox.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driverFirefox.findElement(By.xpath("//span[text()='View quotes']/../*[name()='svg']")).click();
        //tagname[@attributename='attributevalue']
        //driverChrome.close();
/*

Feature
scenario
gherkin (plain english)
Given  - prerequest (it  is used to define the pre condition in out test)
When    - User action ()
And - multiple validation
Then - validation or final outcome
But - Negative assertion



1. Login wit valid cred
2. Login wiht invalid cred
3. Forget password

scenario: validation of login functionality
Given user navigates to the login page
when  user enter the username "user1" and password "pass1"
And user click on login button
Then user navigation to homepage of appplication

Test data -> input used for the testing (parameterisation)

scenario: validation of error message
Given user navigates to the login page of salesforce app
when  user enter the invalid username and password
And user click on login button
Then user validate the error message "error message1"

scenario: validation of Forget password functionality
Given user navigates to the login page of salesforce app
when  user click forget password  link
Then user navigate to forget password page




 */

    }



}
