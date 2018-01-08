package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools_Qa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "http://toolsqa.com/automation-practice-form/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.partialLinkText("Partial Link"));
		
		driver.findElement(By.linkText("Link Test"));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Carson");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wentz");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='exp-4']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("12/16/1983");
		
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		
		driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
		
		Select abc= new Select(driver.findElement(By.id("continents")));
		abc.selectByVisibleText("North America");
//		abc.selectBy
//		
		Select ab= new Select(driver.findElement(By.id("selenium_commands")));
		ab.selectByVisibleText("Wait Commands");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		

	}

}
