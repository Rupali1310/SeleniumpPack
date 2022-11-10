package practiceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class RelativeEx1 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		//WebElement web=driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		//web.click();
		//relative locator without inspect
		WebElement text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
		text.sendKeys("boat headpphones");
		WebElement search=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(text));
		search.click();
		
		//driver.close();
	}
}

