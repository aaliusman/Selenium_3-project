package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "https://www.facebook.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		System.out.println(driver.findElements(By.xpath(".//*[@id='globalContainer']/div[2]/div//a")).size());
		System.out.println(driver.findElements(By.xpath(".//*[@id='globalContainer']/div[2]")).size());
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		if (driver.findElements(By.xpath("ladfj;")).size()==0) {
			System.out.println("doesn't exist");}
			else
			{System.out.println("it exists");
		}

	}

}
