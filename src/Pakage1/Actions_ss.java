package Pakage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\Selenium_2\\chromedriver.exe");
		String url = "https://www.amazon.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Actions ac = new Actions(driver);
		// mouse over
		// ac.moveToElement(driver.findElement(By.id("nav-link-prime"))).build().perform();
		//
		// //
		// driver.findElement(By.xpath(".//*[@id='nav-flyout-prime']/div[2]/div[1]/div[3]/a")).click();
		////
		// ac.contextClick(driver.findElement(By.xpath(".//*[@id='nav-your-amazon']"))).build().perform();

		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("apple watch");
		Thread.sleep(3456);
		// ac.sendKeys(Keys.BACK_SPACE).build().perform();
		// Thread.sleep(4000);
		// ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
		// Thread.sleep(4000);

		Thread.sleep(4000);

		// ac.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
		ac.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		// ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		System.out.println(driver.getTitle());
		//
		Thread.sleep(5000);

		//
		// WebElement
		// cb=driver.findElement(By.xpath(".//*[@id='widgetFilters']/div[1]/div[2]/span[1]/div/label/input"));
		WebElement cb = driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[2]/div/li/span/span/div/label"));
//		System.out.println("is cb selected:"+cb.isSelected());
//		cb.click();
//		System.out.println("is cb selected:"+cb.isSelected());
		Thread.sleep(2000);
		ClickCheck(cb);

		Thread.sleep(4500);
		driver.close();
		// driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		// driver.switchTo().alert().sendKeys("lkajdl");
		// driver.switchTo().alert().getText();
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
