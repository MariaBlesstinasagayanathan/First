import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Locale.Category;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class addAdvertisement {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	  driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  driver.findElement(By.id("memberUsername")).sendKeys("manzoor");
	  
	  //for scrolling down
	  
	  Robot robot = new Robot();
	  Thread.sleep(3000);
	  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@linkurl='memberAds?memberId=9']")).click();
	  driver.findElement(By.id("newButton")).click();
	  driver.findElement(By.name("ad(title)")).sendKeys("Ponds");
	  Select Category=new Select(driver.findElement(By.name("ad(category)")));
	  Category.selectByVisibleText("Example ad category");
	  driver.findElement(By.name("ad(price)")).sendKeys("120");
	  driver.findElement(By.xpath("//input[@name='ad(permanent)']")).click();
	  driver.findElement(By.xpath("//*[@id='cke_contents_descriptionText']/iframe")).click();
	  Thread.sleep(3000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//body//p")).sendKeys("Product is very good");
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.id("saveButton")).click();
	  Alert alert= driver.switchTo().alert();
	  alert.accept();
	  driver.findElement(By.id("backButton")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	  driver.get("http://localhost:8585/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
