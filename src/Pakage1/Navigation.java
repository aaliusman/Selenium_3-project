package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "http://demoqa.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(.,'Registration')]")).click();
		
		WebElement rb=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[2]"));
		System.out.println("Is rb selected?"+rb.isSelected());
		rb.click();
		System.out.println("Is rb selected?"+rb.isSelected());
		
		Select country= new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
		country.selectByVisibleText("Pakistan");
		
		
		Select month= new Select(driver.findElement(By.xpath(".//*[@id='mm_date_8']")));
		month.selectByVisibleText("2");
		
		Select day= new Select(driver.findElement(By.xpath(".//*[@id='dd_date_8']")));
		day.selectByVisibleText("25");
		
		Select year= new Select(driver.findElement(By.xpath(".//*[@id='yy_date_8']")));
		year.selectByVisibleText("1982");
		
		
		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(8000);
//		driver.close();
	}

}
