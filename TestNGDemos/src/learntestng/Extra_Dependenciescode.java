package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Extra_Dependenciescode {
	
	WebDriver driver;
	@Test (description = "Testcase to open application")
	public void startapp()
	{   System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
		System.out.println("Start application");
		
	}
	
	
	
	@Test(dependsOnMethods = "startapp")
	public void loginapp()
	
	{   
		driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("neetik");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Successfully Login");
	}
	
	
	@Test(dependsOnMethods = "loginapp")
	public void signoff()
	
	{   
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		System.out.println("Signoff Successfully");
	}
	
	@Test(dependsOnMethods = "signoff", alwaysRun = true)
	public void closebrowser()
	{
		driver.close();
	}
 

}

