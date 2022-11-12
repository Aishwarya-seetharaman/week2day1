package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicatelead {

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
        
        
        driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HSBC");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rithu");
		driver.findElement(By.name("submitButton")).click();	
		System.out.println(driver.getTitle());
	}

}
