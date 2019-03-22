package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevOps_ui 
{
	public static void main(String[] args)
	{
		String text_result = "Hello World Demo 1";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		 ChromeDriver driver = new ChromeDriver(); 
		driver.navigate().to("http://52.66.118.94:8080/AbcabWebApplication/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("/html[1]/body[1]/h2[1]")).getText();
		System.out.println(text);
		System.out.println(text_result);
		if(text.matches("Hello World Demo 1"))
		{		
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
