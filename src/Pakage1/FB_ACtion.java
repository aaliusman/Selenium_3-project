package Pakage1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_ACtion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.webdriver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//create action class with new object
		Actions ac=new Actions(driver);
		
//		//use of double click
//		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).build().perform();
//		ac.doubleClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).click().click().build().perform();
//		
//		Thread.sleep(3000);
//		//use of right click
//		ac.contextClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2"))).build().perform();
//		
//		driver.findElement(By.id("email")).sendKeys("ABCD");
//		Thread.sleep(3690);
//		//use of press control key and release control key(also include how to use backspace, it will clear everything)
//		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
//		
//		//how to use backspace(if only one character need to delete
//		driver.findElement(By.id("email")).sendKeys("ABCD");
//		ac.sendKeys(Keys.BACK_SPACE).build().perform();
//		Thread.sleep(3400);
//		
//		//how to use tab over
//		ac.sendKeys(Keys.TAB).build().perform();
//		
//		Thread.sleep(3400);
//		// how to use enter key on your keyboard
//		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).build().perform();
		ac.doubleClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).click().click().build().perform();
		Thread.sleep(4000);
		
		ac.contextClick(driver.findElement(By.xpath("//h2[contains(.,'Sign Up')]"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ABCDE");
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("ABCDE");
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("ABCDE");
		ac.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(5000);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		
		
		Thread.sleep(3400);
		
		driver.quit();
		

	}

}
