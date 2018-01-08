package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class United_pkg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "https://www.united.com/ual/en/us/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		System.out.println("is depart box displayed?"+driver.findElement(By.id("Origin")).isDisplayed());
		driver.findElement(By.id("Origin")).sendKeys("Was");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-code='BWI']")).click();
		driver.findElement(By.id("Destination")).sendKeys("Lax");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-code='LAX'][1]")).click();

		System.out.println(driver.findElements(By.tagName("a")).size());
		// driver.findElement(By.id("DepartDate")).click();
		// driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-hover']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label")).click();
		//driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label")).click();
	
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath(".//*[@id='returnDateTimeDiv']/button")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[3]/a")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath(".//*[@id='travelers-selector']/span/span[2]")).click();;
		Actions ac=new Actions(driver);
		ac.doubleClick(driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[1]/div/a[2]"))).click().click().build().perform();
		
		driver.findElement(By.xpath(".//*[@id='travelers-select']/button")).click();
		WebElement cb1=driver.findElement(By.id("AwardTravel"));
		System.out.println("cb1="+cb1.isSelected());
		Thread.sleep(3000);
		cb1.click();
		checkclick(cb1);
		
		WebElement cb2=driver.findElement(By.id("NonStopOnly"));
		System.out.println("is cb2 displayed?"+cb2.isDisplayed());
		System.out.println("cb2="+cb2.isSelected());
		
		checkclick(cb2);
		WebElement hotel=driver.findElement(By.xpath(".//*[@id='openeditsearchorigin']/label"));
		System.out.println("is hotel displayed?"+hotel.isDisplayed());
		System.out.println("is hotel enabled?"+hotel.isEnabled());
		if(driver.findElements(By.id("asdlk")).size()==0)
		{System.out.println("element doesn't exist");}

		
		
		
		
		System.out.println("cb1="+cb1.isSelected());
		System.out.println("cb2="+cb2.isSelected());
	//	driver.findElement(By.xpath(".//*[@id='flightBookingSubmit']")).click();
		Thread.sleep(8000);
		driver.close();

	}
	public static void checkclick(WebElement a) {
		
		if(a.isSelected()==false) {
			a.click();
			if(a.isSelected()==true)
			{
				System.out.println("i have checked the check box");
			}else
				System.out.println("i am not able to select checkbox");}
		else
		{
			System.out.println("checkbox is already checked");

}}}
