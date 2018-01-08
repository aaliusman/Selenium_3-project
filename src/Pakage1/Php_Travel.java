package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Php_Travel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.phptravels.net/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='citiesInput']")).sendKeys("Philadelphia");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //div[@id = 'eac-container-citiesInput']/ul/li[1]/div[1]")).click();
		Thread.sleep(1000);
		Select childin= new Select(driver.findElement(By.xpath("//select[@id='child']")));
		
		childin.selectByVisibleText("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ages']/div/div/div[5]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='EXPEDIA']/form/div[2]/div[4]/button")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(9000);
		driver.close();
		

	}

}
