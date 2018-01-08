package Pakage1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "https://www.facebook.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).build().perform();
		Thread.sleep(2000);
		ac.doubleClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).click().click().build().perform();
		Thread.sleep(2500);
		
		ac.contextClick(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2"))).build().perform();
		
		driver.findElement(By.id("email")).sendKeys("adsfASDF");
		//driver.findElement(By.id("email")).clear();
		Thread.sleep(6700);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(4500);
		driver.findElement(By.id("email")).sendKeys("adsfASDF");
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4500);
		driver.findElement(By.id("email")).sendKeys("adsfASDF");
		
		ac.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(4535);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		
		
		Thread.sleep(6700);
		driver.quit();
	}

}
