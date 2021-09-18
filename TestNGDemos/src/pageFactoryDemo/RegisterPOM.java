package pageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	
	WebDriver driver;
	@FindBy(id="gender-male")
	WebElement mgender;

	@FindBy(id="gender-female")
	WebElement fgender;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(name="ConfirmPassword")
	WebElement confpassword;
	
	@FindBy (xpath="//*[@id='register-button']")
	WebElement registerbtn;
	
	@FindBy(xpath="//*[@href='/logout']")
	WebElement logout;
	
	@FindBy(xpath="//*[@href='/login']")
	WebElement login;
	
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickgenderm()
	{
		mgender.click();
	}
	
	public void clickgenderf()
	{
		fgender.click();
	}
	
	
	public void sendfn(String firnm)
	{
		firstname.sendKeys(firnm);
	}
	public void sendln(String lastnm)
	{
		lastname.sendKeys(lastnm);
	}
	
	public void sendemai(String emi)
	{
		email.sendKeys(emi);
	}
	public void sendpass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void sendconfpass(String cpwd)
	{
		confpassword.sendKeys(cpwd);
	}
	public void clickregister()
	{
		registerbtn.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
	public void clickloginbtn()
	{
		login.click();
	}

}
