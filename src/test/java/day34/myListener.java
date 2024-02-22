package day34;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class myListener implements ITestListener{
  
  @Test
  
  public void onTestStart(ITestResult result) {
	   System.out.println("testing started");
  }
  public void onTestSuccess(ITestResult result) {
	  System.out.println("testing success");
}
  public void onTestFailure(ITestResult result) {
	  System.out.println("testing failure");
  }
  public void onTestSkipped(ITestResult result) {
	  System.out.println("testing skipped");
}
  public void onFinish(ITestContext context) {
	  System.out.println("testing finished");
}
  
  
}
