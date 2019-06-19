package apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailMethods 
{
	WebDriver driver;

	@Test(priority=0)
	public void f() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void g() throws InterruptedException
	{
		driver.findElement(By.name("Email")).sendKeys("j.prasannanjaneyulu131");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void h()
	{
		if(driver.findElement(By.name("Passwd")).isDisplayed())
		{
			System.out.println("Userid is correct");
		}
		else
		{
			System.out.println("Userid is wrong");
		}
	}
	@Test(priority=3)
	public void i()
	{
		driver.close();
	}
}
