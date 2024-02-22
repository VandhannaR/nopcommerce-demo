package day34;

import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ExtentReportManager  implements ITestListener{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
  
  public void onStart(ITestContext context) {
	  
	  sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
	  sparkReporter.config().setDocumentTitle("Automation report");
	  sparkReporter.config().setReportName("Functional Testing");
	  sparkReporter.config().setTheme(Theme.DARK);
	  
	  
	  extent=new ExtentReports();
	  extent.attachReporter(sparkReporter);
	  
	  extent.setSystemInfo("computer name", "local host");
	  extent.setSystemInfo("environment", "QA");
	  extent.setSystemInfo("tester name", "vandhannhaha");
	  extent.setSystemInfo("os", "windows");
	  extent.setSystemInfo("browser name", "chrome,edge");
	  
	  
  }
  public void onTestSuccess(ITestResult result) {
	  test=extent.createTest(result.getName());
	  test.log(Status.PASS,"test case pasSED is:" + result.getName());
  }
  public void onTestFailure(ITestResult result) {
	  test=extent.createTest(result.getName());
	  test.log(Status.FAIL,"test case failed is:" + result.getName());
	  test.log(Status.FAIL,"test case failed cause is:" + result.getThrowable());
  }
  public void onTestSkipped(ITestResult result) {
	  test=extent.createTest(result.getName());
	  test.log(Status.SKIP,"test case SKIPPED is:" + result.getName());
  }
  public void onFinish(ITestContext context) {
	  extent.flush();;
  }
}
