package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		driver.findElement(By.xpath("//button[text()= 'Simple Alert']")).click();
		Thread.sleep(4000);
		//"to click on any positive button like, yes, ok, accept"
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3450);
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		//"To click on any negative button like no, cancel, decline"
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		//to enter text
		driver.switchTo().alert().sendKeys("ABCDE");
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		//to get text and print it
		System.out.println(driver.switchTo().alert().getText());
		
		
		
		driver.close(); 
	}

}
