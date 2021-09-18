package ParallelTestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParallel {
	
	
	
	
    WebDriver driver;
	
	@Test
	public void Verifytitle() 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	      System.out.println("Inside Verifytitle");
	      driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
	      String actualtitle=driver.getTitle();
		  System.out.println(actualtitle);
		  Assert.assertEquals(actualtitle,  "Google");
		  driver.close();
	      //Assert.assertEquals(message, messageUtil.printMessage());
	   }
	@Test
	public void VerifyLogin() 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	      System.out.println("Inside VerifyLogin");
	      driver = new ChromeDriver();
	      driver.get("http://demowebshop.tricentis.com/login");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
		  driver.findElement(By.name("Password")).sendKeys("neetik");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  driver.findElement(By.linkText("Log out")).click();
		  driver.close();
	      //Assert.assertEquals(message, messageUtil.printMessage());
	 }

}
