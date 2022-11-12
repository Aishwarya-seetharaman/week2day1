package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setupthepath {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        //Create object for ChromeDriver
        EdgeDriver driver=new EdgeDriver();
        //window maximize
        driver.manage().window().maximize();
        //Load the  url
        driver.get("http://leaftaps.com/opentaps/control/login");
        //Load the  url
        driver.get("http://leaftaps.com/opentaps/control/login");	
        
        driver.findElement(By.id("username")).sendKeys ("demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
	}

}
