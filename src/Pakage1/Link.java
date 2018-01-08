package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		int a=driver.findElements(By.tagName("a")).size();
		System.out.println("number of links:"+a);

	}

}
