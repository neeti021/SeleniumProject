package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryDemo.LoginPOM;
import pageFactoryDemo.RegisterPOM;

public class VerifyRegisterandLogin {
	
	@Test
	public void validatelogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/register");
	    driver.manage().window().maximize();
	    
	    RegisterPOM registerpage=PageFactory.initElements(driver, RegisterPOM.class);
	    registerpage.clickgenderf();
	    registerpage.sendfn("Parvatiehhe");
	    registerpage.sendln("Kapoor");
	    registerpage.sendemai("parvatiehhekap@gmail.com");
	    registerpage.sendpass("par%%8");
	    registerpage.sendconfpass("par%%8");
	    registerpage.clickregister();
	    registerpage.clicklogout();
	    registerpage.clickloginbtn();
	    
	    LoginPOM loginPage=PageFactory.initElements(driver, LoginPOM.class);
	    
	    loginPage.sendemail("parvatiehhekap@gmail.com");
	    loginPage.sendpassword("par%%8");
	    loginPage.clicklogin();
	    driver.close();
	}


}
