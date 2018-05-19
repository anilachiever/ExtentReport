package exten.report;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

@Test
public class AppTest extends BaseClass{


	boolean result=false;



	public void CompaAB() {

		test.log(LogStatus.INFO, "Method1 Executing ");

		//updating the Method Report
		int a = 5 ; 

		mtest.log(LogStatus.INFO, "assigning A value");


		int b = 5; 
		mtest.log(LogStatus.INFO, "assigning B value");
		
		// comparing the Values
		// updating the method report 

		if(a==b)
		{
			result=true; 

			mtest.log(LogStatus.PASS, "Values are Equal");

		}
		else
		{
			result = false; 
			mtest.log(LogStatus.FAIL, "given values NOT Equal");
		}


		
		//updating the Test report based on the boolean Value 
		test.log(LogStatus.INFO, "Method 1 exe Completed ");

		if(result) {

			test.log(LogStatus.PASS, "Method 1 PASSED");

		}
		else {

			test.log(LogStatus.FAIL, "Method 1 Failed");
		}



	}


	
	public void compCD() {	

		//updating the Test report  
		test.log(LogStatus.INFO, "Method 2 Executing ");

		//updating the Method Report
		int c = 5 ; 
			mtest.log(LogStatus.INFO, "assigning A value");

		int d = 15; 
			mtest.log(LogStatus.INFO, "assigning B value");

			
			// comparing the Values
			// updating the method report 
		if(c==d)
		{
			mtest.log(LogStatus.PASS, "Values are Equal");
			result = true;

		}
		else
		{
			mtest.log(LogStatus.FAIL, "given values NOT Equal");
			result = false;
		}	
		
		//updating the Test report based on the boolean Value 
		test.log(LogStatus.INFO, "Method 2 exe Completed ");

		
		if(result) {

			test.log(LogStatus.PASS, "Method 2 PASSED");

		}
		else {

			test.log(LogStatus.FAIL, "Method 2 Failed");
		}

	}

}
