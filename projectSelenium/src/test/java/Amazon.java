

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\manohar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
//			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//			
//	        String text = driver.findElement(By.xpath("(//div[@class='_3LU4EM'])[1]")).getText();
//	        
//	        System.out.println(text);
	}

}
