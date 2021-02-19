package test1;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "/home/lavanyamstecnot/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
	    
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.w3schools.com/html/html_tables.asp");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	     
	     List  col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
	     System.out.println("Total Columns: " +col.size());
	        
	        
	        List  rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	        
	        System.out.println("Total Rows: " +rows.size());
	        
	         
	        WebElement cellIneed = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[4]/td[1]"));
	        
	        System.out.println("Required Value : " + cellIneed.getText());
	        
	        //Scroll example
	        
	        WebElement element = driver.findElement(By.xpath("//*[@id='main']/h2[1]"));
	        
	        JavascriptExecutor var1 = (JavascriptExecutor) driver;
	        
	        var1.executeScript("arguments[0].scrollIntoView();", element);
	

}
}
