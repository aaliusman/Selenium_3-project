package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "http://toolsqa.com/iframe-practice-page/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Ali");
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("John");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IF2");
		driver.findElement(By.xpath("//a[contains(@class,'ui-tabs-anchor firepath-matching-node')]")).click();
		
		
		
		
	}

}
