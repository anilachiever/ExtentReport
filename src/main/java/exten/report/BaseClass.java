package exten.report;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	ExtentReports report,mreport;
	ExtentTest test,mtest; 
	int i=1;
	
	
	
	@BeforeTest
	void beforeTest(){
		
		report = new ExtentReports("./testReport1.html",true);
		
		test=report.startTest("TEST"); 
	}
	
	@AfterTest
	void AfterTest() {
		
		report.endTest(test);
		report.flush();
	
	}

	
	@BeforeMethod
	void beforeMethod() {
	
		mreport=new ExtentReports("./method"+i+".html",true);
		
		mtest=mreport.startTest("method"+i);
		
	}
	
	@AfterMethod
	void afterMethod() {
		
		mreport.endTest(mtest);
		mreport.flush();
		i++;
		
	}
	
	
}
