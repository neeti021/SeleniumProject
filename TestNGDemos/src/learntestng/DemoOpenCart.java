package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoOpenCart {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		System.out.println("Checking Title");
	    String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,  "Your Store");
		System.out.println("Checking Mac Title");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
	    String actualtitle1=driver.getTitle();
		System.out.println(actualtitle1);
		Assert.assertEquals(actualtitle1,  "Mac");
		System.out.println("Sort By Name");
		driver.findElement(By.id("input-sort")).click();
		WebElement dropdown = driver.findElement(By.id("input-sort"));
	    dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
	    System.out.println("Search Monitors");
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("Monitors");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("button-search")).click();
	    System.out.println("Select Phones and PDAs");
	    driver.findElement(By.id("input-search")).click();
	    driver.findElement(By.name("category_id")).click();
	    WebElement dropdown1 = driver.findElement(By.name("category_id"));
	    dropdown1.findElement(By.xpath("//option[. = 'Phones & PDAs']")).click();
	    driver.findElement(By.id("button-search")).click();
	    driver.close();
		
	}

}
