package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class United_Airline {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "https://www.united.com/ual/en/us/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id=\"bookTravelNav\"]/div[1]/nav/ul/li[2]")).click();

//		driver.findElement(By.id("Origin")).sendKeys("Was");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@data-code='BWI']")).click();
//		driver.findElement(By.id("Destination")).sendKeys("Lax");
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-code='LAX'][1]")).click();
//
//		System.out.println(driver.findElements(By.tagName("a")).size());
		// driver.findElement(By.id("DepartDate")).click();
		// driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-hover']")).click();

//		Thread.sleep(5000);
//		driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[7]/a")).click();
//
//		driver.findElement(By.xpath(".//*[@id='returnDateTimeDiv']/label")).click();
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();
//		
//		 driver.findElement(By.xpath(".//*[@id='travelers-selector']/span/span[2]")).click();
//		 Actions ac = new Actions(driver);
//		 ac.doubleClick(driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]"))).click()
//			.click().build().perform();
		
	//	driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]")).click();

//		Select sc = new Select(driver.findElement(By.xpath(".//*[@id='cabinType']")));
//		sc.selectByVisibleText("Business or First");
//
//		WebElement Award= driver.findElement(By.xpath("//input[@id='AwardTravel']"));
//			
//		WebElement nonstop= driver.findElement(By.id("NonStopOnly"));
//	
//		ClickCheck(Award);
//		ClickCheck(nonstop);
		
		//WebElement Hotel= driver.findElement(By.xpath("//a[@class='ui-tabs-anchor firepath-matching-node']"));
		
//		if(driver.findElements(By.xpath("adsfa")).size()== 0)
//		{System.out.println("this element does not exist");}
		
	//	driver.close();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='flightBookingSubmit']")).click();

}
	public static void ClickCheck(WebElement a) throws InterruptedException
	{
		if (a.isSelected()==false)
		{a.click();
		Thread.sleep(3000);
		if(a.isSelected()==true)
		{System.out.println("I have checked this check box");
		
		}else {
			System.out.println("I am not able to check this box");
		}
		}
	else
	{System.out.println("checkbox is already selected");
	
	}
	}
}
