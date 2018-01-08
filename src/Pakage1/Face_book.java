package Pakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Face_book {

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
		//WebElement url= driver.getCurrentUrl();
//		System.out.println();
		driver.findElement(By.id("pass")).sendKeys("asldjf23");
		//WebElement li=driver.findElement(By.id("))
			
		
		driver.findElement(By.name("firstname")).sendKeys("Asher");
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("r");
		
		driver.findElement(By.name("lastname")).sendKeys("Baig");
		
		//driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		String title2=driver.getTitle();
	//	System.out.println(title2);
		
	
		
		driver.findElement(By.name("reg_email__")).sendKeys("aasjmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hj04849");
		
		Select m= new Select (driver.findElement(By.id("month")));
		m.selectByVisibleText("Mar");
		
		Select d= new Select (driver.findElement(By.id("day")));
		d.selectByIndex(8);
		
		Select y=new Select (driver.findElement(By.id("year")));
		y.selectByValue("1994");
		
	//	driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("I need to provide")).click();
	//	d.selectByValue("1992");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	//	driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
		//input[@id='u_0_9']
		
		
		
	//	driver.findElement(By.linkText("Forgot account?")).click();
		
		
		 
//		driver.quit();
//		driver.close();
	}

}
