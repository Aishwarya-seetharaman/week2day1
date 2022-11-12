package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	//   2. Enter UserName and Password Using Id Locator
      // username: demosalesManager
      //password : crmsfa
      //3. Click on Login Button using Class Locator
      //4. Click on CRM/SFA Link
      //5. Click on Leads Button
      //6. Click on Create Lead 
      //7. Enter CompanyName Field Using id Locator
      //8. Enter FirstName Field Using id Locator
      //9. Enter LastName Field Using id Locator
      //10. Enter FirstName(Local) Field Using id Locator
      //11. Enter Department Field Using any Locator of Your Choice
      //12. Enter Description Field Using any Locator of your choice 
      //13. Enter your email in the E-mail address Field using the locator of your choice
      //14. Click on Create Button
      //15. Get the Title of Resulting Page

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
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aishwarya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("seetharaman");
        driver.findElement(By.name("departmentName")).sendKeys("NonIT to IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual Testing and selenium");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aishrith1914@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        

        		
     
        
	}


	}


