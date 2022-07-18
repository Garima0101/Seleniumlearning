package seleniumprac;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	WebDriver driver;

	@Before
	public void initial() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe") ;
		driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.get("https://objectspy.space/");
	}

	@Test
	public void logintest() throws InterruptedException {
        
		//*[@id="content"]/form/div[7]/input
		// //tagname[@Attribute=’Value’]
		//tag[@Attribute Node = 'value' and @Attribute Node = 'value']
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Merina") ;
		//input[@name = 'lastname']
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Sharma") ;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sharma12");
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@type='radio'][@id='exp-2']")).click() ;
		WebElement datepick = driver.findElement(By.xpath("//input[@type='date'][@id='datepicker']"));
		//datepick.click();
		datepick.sendKeys("06142022") ;		
		driver.findElement(By.xpath("//input[@type='checkbox'][@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][@id='tool-2']")).click() ;
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\garee\\OneDrive\\Pictures\\Screenshots") ;
		Thread.sleep(2000) ;
	}
	//@After
	public  void tearDown()
	{
	   
		driver.close() ;
     	driver.quit() ;
	}
}
