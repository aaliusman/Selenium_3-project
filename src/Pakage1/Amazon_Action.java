package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//mouse over: for right click, double click, click n hold, Hold keys
		Actions ac=new Actions(driver);
//		ac.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//		Thread.sleep(2500);
//		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		Thread.sleep(2234);
		driver.close();
	}

}
