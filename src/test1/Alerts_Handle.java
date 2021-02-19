package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "/home/lavanyamstecnot/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
	    
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	     driver.get("http://demo.guru99.com/test/drag_drop.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	        
         driver.findElement(By.name("cusid")).sendKeys("53920");                    
         driver.findElement(By.name("submit")).submit();
Alert obj = driver.switchTo().alert();
         
         System.out.println(obj.getText());
         
         obj.accept();
	}

}
