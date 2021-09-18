package learntestng;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test
	public void startapp()
	{
		System.out.println("Start application");
		
	}
	
	@Test(priority = 1)
	public void loginapp()
	
	{
		System.out.println("Successfully Login");
	}
	
	@Test(priority = 2)
	public void signoff()
	
	{
		System.out.println("Signoff Successfully");
	}
 
}
