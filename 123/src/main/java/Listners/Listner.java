package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener{
ExtentReports er;
// it will monitor the listner class example when it is strating ending
ExtentTest test;

	public void onTestStart(ITestResult result) {
		//particular test case monitor
		String name= result.getName();
		test = er.createTest(name);
	}

	public void onTestSuccess(ITestResult result) {
		String name =result.getName();
		test.log(Status.PASS,name+"--->pass");
	}
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		test.log(Status.FAIL, name+"--->fail");
	}
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		test.log(Status.SKIP, name+"--->skip");
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\sample"+1+".html ");
		
		//to provide title of the report
		esr.config().setDocumentTitle("final vtiger report");
		
		//providing theme/ color
		esr.config().setTheme(Theme.STANDARD);
		
		//providing the reporter name
		esr.config().setReportName("urmila");
		
		//extra relevent information about report
		er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("operating system", "window");
		er.setSystemInfo("language", "java");
	}

	public void onFinish(ITestContext context) {
		er.flush();
	}

	
}
