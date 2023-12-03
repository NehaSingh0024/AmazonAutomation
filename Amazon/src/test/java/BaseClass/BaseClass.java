package BaseClass;
   
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()
	{
		try {
			
			FileInputStream File = new FileInputStream("src\\test\\resources\\reads\\setup.properties");
			Properties prop = new Properties();
			prop.load(File); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		File.close(); 
		
		
	}
	 
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new FirefoxDriver();
	
		driver.manage().window().maximize();  //maximizing the window
		driver.manage().deleteAllCookies(); 

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
   
		driver.get(prop.getProperty("URL"));
		
//		switch(browser) {
//		case "Chrome":
//			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
//			driver=new ChromeDriver();  
//			break;
//		case "Firefox":
//			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\Drivers\\geckodriver.exe");
//			driver=new FirefoxDriver(); 
//			break;  
//		case "Edge":
//			System.setProperty("webdriver.edge.driver","src\\test\\resources\\Drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			break;	
//		} 
  
}
}