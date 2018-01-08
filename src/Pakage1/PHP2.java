package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHP2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		
		driver.findElement(By.xpath(".//*[@id='body-section']/div[2]/div[2]/div/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='flights-origin-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).clear();
		driver.findElement(By.xpath(".//*[@id='flights-origin-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).sendKeys("bwi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'mewtwo-autocomplete-list-item-info__details')]")).click();
		driver.findElement(By.xpath(".//*[@id='flights-destination-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).sendKeys("lga");
		Thread.sleep(2501);
		driver.findElement(By.xpath("//span[contains(@class,'mewtwo-autocomplete-list-item-info__name')]")).click();
		Thread.sleep(3455);
		driver.findElement(By.xpath(".//*[@id='flights-dates-depart-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).click();
		driver.findElement(By.xpath(".//*[@id='mewtwo-datepicker-2018-1-10']/div")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath(".//*[@id='flights-dates-depart-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).click();
		driver.findElement(By.xpath(".//*[@id='mewtwo-datepicker-2018-1-24']/div")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='flights-form-e823caac1a24a0172d4ee792e5dad7d9']/div[5]/div")).click();
		
		driver.findElement(By.xpath("//div[@class=\"mewtwo-popup-ages-counter\"]/span[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='flight_type__checkboxe823caac1a24a0172d4ee792e5dad7d9']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='flights-form-e823caac1a24a0172d4ee792e5dad7d9']/div[6]/button")).click();
		
	//	Thread.sleep(10000);
		
	//	driver.findElement(By.xpath("//a[contains(@class,'ticket-action-button-deeplink ticket-action-button-deeplink-- firepath-matching-node')]")).click();
		Thread.sleep(8000);
		driver.close();
		
		

	}

}
