package testNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_flip_amz
{
	@Test
	public void flip() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ title='Search for products, brands and more']")).sendKeys("i phone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Blue, 128 GB)']")).click();

		Set<String> g = driver.getWindowHandles(); 
		ArrayList<String> a=new ArrayList<String>(g); 
		String newtab = a.get(1);
		driver.switchTo().window(newtab);
		Thread.sleep(3000);
		WebElement te = driver.findElement(By.xpath("//span[.='APPLE iPhone 14 (Blue, 128 GB)']/../../../div[4]/div[1]/div[1]/div[1]"));
		String text = te.getText();
		System.out.println(text);
	}
	@Test
	public void amz() throws InterruptedException
	{
		    System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.amazon.in");
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 13");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@ id='nav-search-submit-button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - (Product) RED']")).click();

			Set<String> two_id = driver.getWindowHandles();
			ArrayList<String> a= new ArrayList<String>(two_id);
			String newtab = a.get(1);
			driver.switchTo().window(newtab);
			Thread.sleep(3000);
			WebElement te = driver.findElement(By.xpath("//span[@id='productTitle']/../../../../div[10]/div[3]/div[1]"));
			String text1 = te.getText();
			System.out.println(text1);
	}
	
}
