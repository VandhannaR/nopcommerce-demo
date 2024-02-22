package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.SocketException;

public class loginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub"
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		
		//FileInputStream file=new FileInputStream("C:\\Users\\2308345\\eclipse-workspace\\SeleniumProject\\src\\testdata\\last.xlsx");
		String file=System.getProperty("user.dir")+"\\testdata\\last.xlsx";
		int rows=WritindDatas.getRowCount(file, "Sheet1");
		
		for(int r=1;r<=rows;r++) {
			String price=WritindDatas.getCellData(file, "Sheet1", r, 0);
			String roi=WritindDatas.getCellData(file, "Sheet1", r, 1);
			String period1=WritindDatas.getCellData(file, "Sheet1", r, 2);
			String period2=WritindDatas.getCellData(file, "Sheet1", r, 3);
			String frequency=WritindDatas.getCellData(file, "Sheet1", r, 4);
			String exp_value=WritindDatas.getCellData(file, "Sheet1", r, 5);
		
		//System.out.println(rows);
			driver.findElement(By.id("principal")).sendKeys(price);
			driver.findElement(By.id("interest")).sendKeys(roi);
			driver.findElement(By.id("tenure")).sendKeys(period1);
		    Select s1=new Select(driver.findElement(By.id("frequency")));
		    s1.selectByVisibleText(frequency);
	    
		    Select s2=new Select(driver.findElement(By.id("tenurePeriod")));
		    s2.selectByVisibleText(period2);
		    
		    
		    JavascriptExecutor js=(JavascriptExecutor) driver;
		    
		    WebElement e=driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
		    js.executeScript("arguments[0].click();",e);
		    
		    String act_value=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_value)==Double.parseDouble(act_value)){
				
				System.out.println("passed");
				WritindDatas.setCellData(file, "Sheet1", r, 7, "Passed");
				WritindDatas.fillGreenColor(file,"Sheet1", r, 7);
			
			
			}
			else {
				
				System.out.println("failed");
				WritindDatas.setCellData(file, "Sheet1", r, 7, "failed");
				WritindDatas.fillGreenColor(file,"Sheet1", r, 7);
				
			}
			Thread.sleep(3000);
			
			WebElement e1=driver.findElement(By.xpath("//img[@class='PL5']"));
			js.executeScript("arguments[0].click();", e1);
		
		}*/
	    
	    
	    
	/*FileInputStream file=new FileInputStream("C:\\Users\\2308345\\eclipse-workspace\\SeleniumProject\\src\\testdata\\Poi.xlsx");
		 
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcells);
		
		
		for(int r=0;r<totalrows;r++) {
			
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++) {
				
				XSSFCell cell=currentRow.getCell(c);
				
				String val=cell.toString();
				System.out.println(val);
				
			}
		}
		workbook.close();
		//file.close();
		//int totalcells=sheet.getRow(1).getLastCellNum();
		
		//WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver","C:\\drivers\\msedgedriver.exe");
		/*EdgeDriver driver=new  EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		//WebElement txt=driver.findElement(By.name("username"));		
		//txt.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();*/
	
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		
		
		//driver.findElement(By.xpath.click();
		/*String title=driver.getTitle();
		String exp="OrangeHRM";
		if(title.equals(exp)) {
			System.out.println("pass");
		}
		else {
			System.out.println("no");
		}*/
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"")).click();
		//driver.quit();
		
		
		/*EdgeDriver driver=new  EdgeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fregisterresult%2F1");
		
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		logo.click();
		System.out.println(logo.isSelected());*/
		
		//EdgeOptions options= new EdgeOptions();
		//options.setHeadless(true);
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int brokenLink=0;
		for(WebElement link:links) {
			String targetLink=link.getAttribute("href");
			if(targetLink==null || targetLink.isEmpty()) {
				System.out.println("href is empty");
				continue;
			}
			URL linkURL=new URL(targetLink);
			HttpURLConnection con=(HttpURLConnection) linkURL.openConnection();
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println(targetLink+"   "+"broken link");
				brokenLink++;
			}
			else {
				System.out.println(targetLink+"   "+"not broken link");
			}
			
			
		}
		System.out.println("total"+brokenLink);
		//http://admin:admin@the-internet.herokuapp.com//basic_auth
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String check=driver.getTitle();
		String real="OrangeHRM";
		if(real.equals(check)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		/*WebElement featured=driver.findElement(By.className("stats-section"));
		File src=featured.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2308345\\OneDrive - Cognizant\\Pictures\\Screenshots\\screen3 .png");
		FileUtils.copyFile(src, trg);
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2308345\\OneDrive - Cognizant\\Pictures\\Screenshots\\screen1.png");
		FileUtils.copyFile(src, trg);
		//driver.get("https://the-internet.herokuapp.com/key_presses?");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		/*driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		
		int brokenLink=0;
		for(WebElement link:links) {
			String targetLink=link.getAttribute("href");
			if(targetLink==null || targetLink.isEmpty()) {
				System.out.println("href is empty");
				continue;
			}
			URL linkURL=new URL(targetLink);
			HttpURLConnection con=(HttpURLConnection) linkURL.openConnection();
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println(targetLink+"   "+"broken link");
				brokenLink++;
			}
			else {
				System.out.println(targetLink+"   "+"not broken link");
			}
			
			
		}
		System.out.println("total"+brokenLink);
		
		
		//driver.switchTo().frame(0);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset", "") );
		
		//WebElement e=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[69]/td[1]/img"));
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		/*WebElement e=driver.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('value','9865')", e);
		
		
		
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"male\"]"));
		js.executeScript("arguments[0].click();", e1);
		
		//js.executeScript(null, args)
		
		
		
		
		
		/*Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		a.sendKeys(Keys.TAB).perform();
		a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		//
		
		//driver.switchTo().frame(0);
		/*Actions a=new Actions(driver);
		WebElement slider1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println(slider1.getLocation());
		a.dragAndDropBy(slider1, -200, 46).perform();
		System.out.println(slider1.getLocation());
		
		
		//Actions a=new Actions(driver);
		WebElement slider2=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println(slider2.getLocation());
		a.dragAndDropBy(slider2, 200, 46).perform();
	
		System.out.println(slider2.getLocation());
		
		
		
		
		/*Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		WebElement e2=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		a.dragAndDrop(e1, e2).perform();
		
		
		
		WebElement stockHolm=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		a.dragAndDrop(stockHolm, rome).perform();
		
		
		
		
		
		
		
	     
		
		
		
		/*Set<String> s=driver.getWindowHandles();
	    List<String> l=new ArrayList(s);
	     
	     for(String se:s) {
	    	driver.switchTo().window(se).getTitle();
	    	System.out.println(se);
	    	 
	    	 
	     }
	     driver.quit();
		/*List<String> l=new ArrayList(e);
		
		String first=l.get(0);
		String last=l.get(1);
		
		driver.switchTo().window(last);
		
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_EmailHomePage\"]")).sendKeys("hellos");
		
		driver.switchTo().window(first);
	
		
		
		
		
		//*[@id="id1"]/div/input
		
		/*WebElement e=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("helo");
		
		
		driver.switchTo().defaultContent();
		
		WebElement e1=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(e1);
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("hello");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		
	
		//driver.findElement(By.xpath());
		
	  /* Alert alertwindow=driver.switchTo().alert();
	   alertwindow.accept();
	   /* Alert alertwindow=driver.switchTo().alert();
	   
	    //System.out.println(alertwindow.getText());
	    alertwindow.sendKeys("welcome");
	    alertwindow.accept();
	    //Alert alertwindow=myWait.until(ExpectedConditions.alertIsPresent());
	   // System.out.println(alertwindow.getText());
	    //alertwindow.accept();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//option[ text()=\"France\"]")).click()	;	
		/*List< WebElement> el=driver.findElements(By.xpath("//ul[@jsname='bw4e9b' ]/li"));
		System.out.println(el.size());
		
		for(int i=0;i<el.size();i++) {
			String sel=el.get(i).getText();
			if(sel.equals("selenium tutorial")) {
				el.get(i).click();
				break;
				
			}
			
		}
		//System.out.println(el.size());
		
		/*for(WebElement e:el) {
			if(e.equals("Select State")) {
				System.out.println(e.getText());
				
			}
			
		}
		//Select ele=new Select(el);
		
		/*List<WebElement> elements=ele.getOptions();
		System.out.println(elements.size());
		
		for(WebElement e:elements) {
			System.out.println((e).getText());
		}*/
		
		//ele.selectByValue("3");
		//System.out.println(ele.getOptions());
		
		
		
	}
		
		
		
	

}