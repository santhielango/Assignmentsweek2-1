package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowserclassroom {

			public static void main(String[] args) throws InterruptedException {
			
			// TODO Auto-generated method stub
			//step :1 Connect with the Browser Driver(exe.file) 
				 WebDriverManager.chromedriver().setup();
			 
			//step:2 Launch the browser
			    ChromeDriver driver = new ChromeDriver();
			  
		  //step :3 Load the URL
			    driver.get("http://leaftaps.com/opentaps/control/main");
			    
	      //  to maximize the browser
			    driver.manage().window().maximize();
			    
	     // to wait for the driver to locate the element
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
		 // step: 4 Enter the User name
	     //If the value of the locator is not proper,it throws the exception as NoSuchElement
			    
			    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			    
	    // step:5 Enter the password		    
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    
	    // step :6 click the login button		    
			    driver.findElement(By.className("decorativeSubmit")).click();
		
	    //step :7 click the CRM/SFA		    
			    driver.findElement(By.linkText("CRM/SFA")).click();
			    
	   // step : 8 click the Leads		    
			    driver.findElement(By.linkText("Leads")).click();
			    
	  //step :9 close the browser
			    Thread.sleep(2000);
	            driver.close();      
			}

}




