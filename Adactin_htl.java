package PROJECT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_htl {
	
	public static void main (String []args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://adactinhotelapp.com/");
	    
	    driver.manage().window().maximize();
	    
	    WebElement user = driver.findElement(By.id("username"));
	    
	    user.sendKeys("Naveendustin");
	    
	    WebElement pass =  driver.findElement(By.name("password"));
	    
	    pass.sendKeys("naveen@3697");
	    
	    WebElement login =   driver.findElement(By.xpath("//input[@name='login']"));
	    
	    login.click();
	    
	    WebElement loc = driver.findElement(By.id("location"));
	    
	    Select s = new Select(loc);
	    
	    s.selectByIndex(4);
	    
	    WebElement hot = driver.findElement(By.name("hotels"));
	    
	    Select s1 = new  Select(hot);
        Thread.sleep(1000);	 
        
	    s1.selectByVisibleText("Hotel Sunshine");
	    
	    WebElement Rtype = driver.findElement(By.id("room_type"));
	    Thread.sleep(1000);	
	    
	    Rtype.sendKeys("Douple");
	    
	    WebElement Rno = driver.findElement(By.name("room_nos"));
	    Thread.sleep(1000);	
	    
	    Rno.sendKeys("2-Two");
	    
	    WebElement DateIn = driver.findElement(By.id("datepick_in"));
	    Thread.sleep(1000);	
	    
	    DateIn.sendKeys("27/12/2022");
	    
	    WebElement DateOut = driver.findElement(By.name("datepick_out"));
	    Thread.sleep(1000);	
	    
	    DateOut.sendKeys("31/12/2022");
	    
	    WebElement Adrm = driver.findElement(By.id("adult_room"));
	    Thread.sleep(1000);	
	    
	    Adrm.sendKeys("2-Two");
	    
	    WebElement CHrm = driver.findElement(By.name("child_room"));
	    Thread.sleep(1000);	
	    
	    CHrm.sendKeys("1-One");
	    
	    WebElement search = driver.findElement(By.id("Submit"));
	    Thread.sleep(1000);	
	    
	    search.click();
	    
	    WebElement Continue = driver.findElement(By.name("radiobutton_0"));
	    Thread.sleep(1000);	
	    
	    Continue.click();
	    
	    WebElement Book = driver.findElement(By.id("continue"));
	    Thread.sleep(1000);	
	    
	    Book.click();
	    
	    WebElement Fname = driver.findElement(By.name("first_name"));
	    Thread.sleep(1000);	
	    
	    Fname.sendKeys("V Naveen");
	    
	    WebElement Lname = driver.findElement(By.id("last_name"));
	    Thread.sleep(1000);	
	    
	    Lname.sendKeys("Kumar");
	    
	    WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
	    Thread.sleep(1000);	
	    
	    Address.sendKeys("34/100 Mallampalayam vangal east karur");
	    
	    WebElement Cnum = driver.findElement(By.name("cc_num"));
	    Thread.sleep(1000);	
	    
	    Cnum.sendKeys("4263748596052138");
	    Thread.sleep(1000);	
	    
	    WebElement Ctype = driver.findElement(By.id("cc_type"));
	    
	    Select s2 =new Select(Ctype);
	    Thread.sleep(1000);	
	    
	    s2.selectByIndex(2);
	    
	    WebElement Cmonth = driver.findElement(By.name("cc_exp_month"));
	    Thread.sleep(1000);	
	    
	    Cmonth.sendKeys("July");
	    
	    WebElement Cyear = driver.findElement(By.id("cc_exp_year"));
	    Thread.sleep(1000);	
	    
	    Cyear.sendKeys("2022");
	    
	    WebElement Cno = driver.findElement(By.name("cc_cvv"));
	    Thread.sleep(1000);	
	    
	    Cno.sendKeys("5543");
	    
	    WebElement Book1 = driver.findElement(By.xpath("//input[@id='book_now']"));
	    Thread.sleep(1000);	
	    
	    Book1.click();
	    
	    WebElement Booked = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
	    Thread.sleep(1000);	
	    
	    Booked.click();
	    
	    Thread.sleep(1000);	
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destin = new File("C:\\Users\\Deepam\\eclipse-workspace\\Testing\\Screenshot.png");
	    
	    FileUtils.copyFile(src, destin);
	    
	   	    
	
	
	    
	    
	    
	    
	    
	    
	}

}
