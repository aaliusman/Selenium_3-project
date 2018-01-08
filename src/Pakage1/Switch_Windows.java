package Pakage1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		String url= "http://toolsqa.com/automation-practice-switch-windows/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	//	System.out.println(driver.getTitle());
		String mainwin=driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		 Thread.sleep(2459);
		 
		 Set <String> wins = driver.getWindowHandles();
		 for(String a : wins) {
			 System.out.println(a);
			 if(!a.equalsIgnoreCase(mainwin)){
			 driver.switchTo().window(a);
			 System.out.println(driver.getTitle());
			 
			 
		 }

	}
		 driver.switchTo().window(mainwin);
		 driver.quit();
}
}