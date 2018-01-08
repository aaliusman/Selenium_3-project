package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "https://www.facebook.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Actions ac=new Actions(driver);
		
		driver.findElement(By.id("email")).sendKeys("aklskjhkhjjhkhhkkl");
	//	ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();

	}

}
