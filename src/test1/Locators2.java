package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "/home/lavanyamstecnot/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
	    
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	    // WebElement lnkLogin=driver.findElement(By.xpath("//a[@class='login']"));
	    // lnkLogin.click();
	     
	     WebElement createAcc=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
	     createAcc.click();
        WebElement fname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	     fname.sendKeys("abc");
	     WebElement lname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	     lname.sendKeys("dec");
	     WebElement MobNo=driver.findElement(By.xpath("//input[@name=\"Mobile number or email\"]"));
	     MobNo.sendKeys("009988");
	     
	     
	     
	     
	     //WebElement lname=driver.findElements(By.xpath());///input[@name=""]
	     
	   /*  WebElement username=driver.findElement(By.xpath("//input[@name='user_login']"));
	     username.sendKeys("abc@xyz.com");
	     WebElement usePwd=driver.findElement(By.xpath("//input[@name='user_pwd']"));
	      usePwd.sendKeys("9900");*/
	}

}
