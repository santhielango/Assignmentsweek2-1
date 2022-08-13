package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
     //step:1 connect with the browser 
	 WebDriverManager.chromedriver().setup();
	 
	 //step:2 Launch the browser
	  ChromeDriver driver = new ChromeDriver();
	  
	  //step :3 Load the URL
	  driver.get("http://leaftaps.com/opentaps/control/main");
	 

}}
