package learntestng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProviderDemo {
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email, String password) {
	    System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.name("Password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.findElement(By.linkText("Log out")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "neetikayap@gmail.com", "neetik" },
      new Object[] { "shruthikash@gmail.com", "neetik" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  

}
