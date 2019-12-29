import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Logout {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	  driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	  Alert alert = driver.switchTo().alert();
		 alert.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver.get("http://localhost:8585/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
