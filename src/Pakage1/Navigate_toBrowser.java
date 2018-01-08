package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_toBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url= "https://www.facebook.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String title1=driver.getTitle();
		System.out.println(title1);
		WebElement em=driver.findElement(By.id("email"));
		em.sendKeys("aaman@gmail.com");
		
		
		driver.navigate().to("https://www.united.com/ual/en/us/");
		
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();

	}

}
