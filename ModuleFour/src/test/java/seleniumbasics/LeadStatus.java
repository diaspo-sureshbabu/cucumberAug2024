package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LeadStatus {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://imcrmuat.alfred.ae/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a [@href= 'https://imcrmuat.alfred.ae/auth/google'] ")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//div[@class='yAlK0b'])[2]")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("sureshbabu.rajendran@myalfred.com");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://imcrmuat.alfred.ae/quotes/car/UPFVV38S");
        // Find elements using tag name
        List<WebElement> allLeadStatus = driver.findElements(By.xpath("//span[@class='flex-1 truncate py-px']"));

        System.out.println("number of elements" + allLeadStatus.size());
    }
}
