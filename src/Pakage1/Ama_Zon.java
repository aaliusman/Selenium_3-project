package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ama_Zon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "https://www.amazon.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple watch");
		driver.findElement(By.xpath("//input[@value='Go']")).click();

	}

}
