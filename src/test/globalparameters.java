package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class globalparameters {
	public WebDriver driver=null;
	
	@Test
	
	public void Login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\srinath\\eclipse-workspace\\TestNGTutorial\\src\\test\\datadriven.properties");
		prop.load(fis);
		
		//System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
				{
			 driver=new FirefoxDriver();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
              driver=new ChromeDriver();
		
		}
		
		else
		{
			  driver=new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	

}
