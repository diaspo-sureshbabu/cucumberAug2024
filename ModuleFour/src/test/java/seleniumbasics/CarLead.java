package seleniumbasics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class CarLead {
    static  seleniumbasics.Exceloperations excel = new seleniumbasics.Exceloperations();
    static String excelFilePath
            =Constants.TestData_FILEPATH+Constants.TestData_FILENAME;
    static WebDriver driver;

    @BeforeClass
    public void setup()
    {
        //WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
    }


    @Test
    public void loginTest() throws InterruptedException, IOException
    {

        driver.get(Constants.URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        excel.setExcelFile(excelFilePath, "LoginTestData");


        for(int i=1;i<=excel.getRowCountInSheet();i++)
        {
            WebElement workEmail =
                    driver.findElement(By.id("userId"));
            workEmail.clear();
            workEmail.sendKeys(excel.getCellData(i, 0));

            WebElement passWord =
                    driver.findElement(By.name("password"));
            passWord.clear();
            passWord.sendKeys(excel.getCellData(i, 1));

            WebElement createAccountButton =
                    driver.findElement(By.id("loginSubmitBtn"));
            createAccountButton.click();

            String title = driver.getTitle();
            if(title.equals("HubSpot Form"))
            {
                excel.setCellValue(i, 2, "Passed", excelFilePath);
            }
            else
            {
                excel.setCellValue(i, 2, "Failed", excelFilePath);
            }
        }

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
