package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhi");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elango");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("santhi");
	     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1300000");
	     driver.findElement(By.id("createLeadForm_description")).sendKeys("SeleniumWebBrowser");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeeveshnitin@gmail.com");
	     driver.findElement(By.name("submitbutton")).click();
	     String title= driver.getTitle();
	     System.out.println("title");
	     driver.close();
	     driver.findElement(By.className("subMenuButton")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shanthi");
	     driver.findElement(By.name("submitbutton")).click();
	     String title1;
		 String titleduplicate = driver.getTitle();
		 System.out.println("title");
	}
	

	     
	     
	

	}


