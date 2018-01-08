package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class American_Airline {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='loginForm.loginId']")).sendKeys("Ayesha");
		driver.findElement(By.name("lastName")).sendKeys("Siddiqui");
		
		WebElement pazword=driver.findElement(By.id("loginForm.password"));
		pazword.sendKeys("12345");
		
		driver.findElement(By.xpath("//span[@class='control left']")).click();
		
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("JFK");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'JFK - New York John F Kennedy Intl, NY')]")).click();
		
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("NYC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'LGA - New York LaGuardia, NY')]")).click();
		
		Select passengers=new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
		passengers.selectByVisibleText("3");
		
		
		
		
		
		
		
	}

}
