package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	String From = "Bnagalore";
	String To = "Chennai";
	Actions ack;
	WebDriverWait Explitwait;
  @Test
  public void test() throws Throwable   {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\PTBLR-1193\\Downloads\\Firefox\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 
	 driver.get("http://ezzybooking.com/en");
	// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//driver.navigate().refresh();;
	 String title = driver.getCurrentUrl();
	 
	System.out.println(title);
	
	driver.findElement(By.xpath("//a[contains(.,'Round Trip')]")).click();

	
	driver.findElement(By.xpath("//input[@name='from']")).sendKeys("  ");	 
	List<WebElement> fromEle =driver.findElements(By.cssSelector(".ui-corner-all"));
	
	for(WebElement Frmpls : fromEle){
		System.out.println(Frmpls.getText());
		/*if(Frmpls.getText().contains(From)){
		
			Frmpls.click();
			break;
		}*/
		
	}
	/* driver.findElement(By.xpath("//input[@id='to']")).sendKeys(To);

	List<WebElement> aa = 	 driver.findElements(By.cssSelector("#ui-id-2 .ui-menu-item"));
	for(WebElement a : aa){
	System.out.println(a.getText());
	String location = a.getText();
	
	if(location.trim().contains(To)){
		a.click();
	
	Thread.sleep(100);
		System.out.println("matched @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  " +location);
				
		break;
		
	}
	}

	
	
	

	WebElement depDate  = 	driver.findElement(By.xpath("//input[@name='depature']"));
	 ack = new Actions(driver);
	 Explitwait = new WebDriverWait(driver, 10);
	 //Explitwait.until(ExpectedConditions.);
	System.out.println(depDate.getAttribute("placeholder") + " ffrrffffffffff" );
		depDate.click();
	driver.findElement(By.xpath("//a[contains(.,'14')]")).click();
		System.out.println("ggrg pass");
*/
  }
}
