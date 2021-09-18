package ParallelTestingDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParallel2 {
	
	
	
	@Test
	public void startapp()
	{
		System.out.println("Start application");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.close();
			
	}
		
	@Test
	public void CheckTitle()
		
	{
		System.out.println("Checking Google Title");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,  "Google");
		driver.close();
	}
		
	@Test
	public void CheckLoginFunction()
		
	{
		System.out.println("Checking Login");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("neetik");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
		
	}
	 
}



