package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryDemo.LoginPOM;

public class VerifyLogin {
	
	@Test
	public void validatelogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    
	    LoginPOM loginPage=PageFactory.initElements(driver, LoginPOM.class);
	    
	    loginPage.sendemail("neetikayap@gmail.com");
	    loginPage.sendpassword("neetik");
	    loginPage.clicklogin();
	    driver.close();
	}

}
