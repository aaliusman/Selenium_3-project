package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dominos_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dominos.com/en/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-quid='main-nav-link-0']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'input--icon Delivery js-delivery c-delivery')]")).click();
		Thread.sleep(3400);
		Select at= new Select(driver.findElement(By.xpath(".//*[@id='Address_Type_Select']")));
		at.selectByVisibleText("House");
		Thread.sleep(2000);
		driver.findElement(By.id("Street")).sendKeys("827 Bellevue Ave");
		driver.findElement(By.id("City")).sendKeys("Penndel");
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.xpath(".//*[@id='Region']")));
		state.selectByVisibleText("PA");
		driver.findElement(By.xpath("//input[@id='Postal_Code']")).sendKeys("19047");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'body c-order-entrees-Popular Items')]")).click();
		
		driver.findElement(By.xpath(".//*[@id='entreesPage']/div/div[4]/div/div/div[2]/div[1]/ul/li[1]/a/h5")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='orderSummaryInColumn']/div[2]/div[1]/a/span")).click();
		
		
		

	}

}
