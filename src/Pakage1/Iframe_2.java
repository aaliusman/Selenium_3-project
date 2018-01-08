package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
		//switching to iframe by index
		//driver.switchTo().frame(0);
		
		//switching to iframe by name
		driver.switchTo().frame("IF1");
		
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"))
				.sendKeys("Usman");
		driver.findElement(By.xpath(".//*[@id='sex-0']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'frames to')]")).getText());
	}

}
