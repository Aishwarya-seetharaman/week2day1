package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
        
        EdgeDriver driver=new EdgeDriver();
       
        driver.manage().window().maximize();
        
        
        driver.get("http://leaftaps.com/opentaps/control/login");	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.id("username")).sendKeys ("demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        System.out.println(driver.getTitle());
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //Click Contacts Tab
        //Click Create Contact
        //Type First Name
        //Type Last Name
        //Click Create Contact Button
        //Print the first name and browser title 
        //Close the browser
        
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Aishwarya");
        driver.findElement(By.id("lastNameField")).sendKeys("seetharaman");
        driver.findElement(By.name("submitButton")).click();
        System.out.println("firstname:"+driver.getTitle());
        

	}

}
