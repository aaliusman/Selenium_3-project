package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class South_Actions_Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.southwest.com/");
		
		
//		Actions ac=new Actions(driver);
//		ac.contextClick(driver.findElement(By.xpath(".//*[@id='jb-main-page']/div[1]/a/div/h2[1]"))).build().perform();
//		ac.moveToElement(driver.findElement(by.))
		
		
	}

}
