package practiceExample;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNevaigate 
{


	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		//nevigate commands:
		
		driver.get("https://demoqa.com/");	
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
		// dimenstion class

		
		Dimension c=driver.manage().window().getSize();
		System.out.println(c);
		
		Dimension d=new Dimension(500,600);
		//driver.manage().window().setSize(d);
		
		driver.manage().window().maximize();
		// point class
		
		Point p=new Point(200,400);
		driver.manage().window().setPosition(p);
		
		
		
}
}