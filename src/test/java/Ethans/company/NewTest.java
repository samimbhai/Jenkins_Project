package Ethans.company;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewTest {
 
	@Test  // equivalent to main method of java  -  1st test case
 public void launchBrowser(){         
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  	/*ExtentHtmlReporter htmlreports=new ExtentHtmlReporter("D:\\Reports\\createBatch.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(htmlreports);
		ExtentTest logger=reports.createTest("Aut_01_VerifyLoginToFlightApplication","verify user is able to login successfully");
		
		logger.log(Status.PASS, "Flight app url is launched");
		logger.log(Status.PASS, "Successfully enter username");
		logger.log(Status.PASS, "Successfully enter password");
		logger.log(Status.PASS, "Click on login button");
		reports.flush();*/
	  
	    
  }
	
  
  /*@Test  // equivalent to main method of java  -   2nd test case -There are two test cases here
  public void launchBrowser1(){         
 	  System.out.println("hello");
   }*/
	
	
}
