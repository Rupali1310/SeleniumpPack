package practiceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Example1 
{
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	String cur=driver.getCurrentUrl();
	System.out.println(cur);
	driver.manage().window().minimize();
	//relative path
	WebElement web=	driver.findElement(By.xpath("//span(text()='active makeFlex hrtlCenter column')"));
	web.click();
	
	driver.quit();
}
}
