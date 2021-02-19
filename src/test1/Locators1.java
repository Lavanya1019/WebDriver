package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

		public static void main(String[] args) {
		
			System.setProperty("webdriver.chromedriver", "/home/lavanyamstecnot/Downloads/chromedriver");
			System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
		    
		    WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
		     driver.get("https://www.simplilearn.com/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		     WebElement lnkLogin=driver.findElement(By.xpath("//a[@class='login']"));
		     lnkLogin.click();
		     WebElement username=driver.findElement(By.xpath("//input[@name='user_login']"));
		     username.sendKeys("abc@xyz.com");
		     WebElement usePwd=driver.findElement(By.xpath("//input[@name='user_pwd']"));
		      usePwd.sendKeys("9900");
		      
		      
		      
		       // WebElement chkbox=driver.findElement(By.name("remember me"));
		        //chkbox.click();
		        //WebElement btnPwd=driver.findElement(By.xpath(//input[@name='btn_login']));
		       // btnPwd.click();
		       // driver.quit();

		}
		     

}
