package demowebshoptest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import pompackage.LoginPagePOM;



public class ValidateLogin {
	
	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    
	    LoginPagePOM login = new LoginPagePOM(driver);
	    
	    login.enteremail("neetikayap@gmail.com");
	    login.enterpassword("neetik");
	    login.clicksignin();
	    
	    
	}
	
	

}
