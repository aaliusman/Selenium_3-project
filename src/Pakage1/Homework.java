package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "http://demoqa.com/registration/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("first name");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("LASt name");
		driver.findElement(By.xpath("//input[@value='married']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		
		Select c= new Select (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		c.selectByVisibleText("Pakistan");
		
		Select m= new Select (driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		m.selectByVisibleText("12");
		Thread.sleep(2000);
		Select d= new Select (driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		d.selectByVisibleText("16");
		
		Select y= new Select (driver.findElement(By.xpath("//select[@id='yy_date_8']")));
		y.selectByVisibleText("1983");
		
		driver.findElement(By.xpath("//input[@name='phone_9']")).sendKeys("2674962177");
		Thread.sleep(2300);
		driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys("ad23sfa");
		driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys("adfasdf34");
		driver.findElement(By.xpath("//input[@name='pie_submit']")).click();
	}

}
