package learntestng;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
WebDriver driver;	
	@Test
	public void testlogin() throws MalformedURLException
	{
		DesiredCapabilities cpt=DesiredCapabilities.chrome();
		cpt.setBrowserName("chrome");
		cpt.setPlatform(Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.2:4355/wd/hub"), cpt);
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("neetik");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
	

}
