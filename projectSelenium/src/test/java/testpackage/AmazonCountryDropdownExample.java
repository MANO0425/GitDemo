package testpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCountryDropdownExample {
	public static void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Launch the browser and navigate to the Amazon website
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// Find the country dropdown element
		Select countryDropdown = new Select(driver.findElement(By.id("icp-touch-link-country")));

		// Select AUS +61 from the dropdown
		countryDropdown.selectByValue("AU");

		// Wait for the page to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click the "Done" button to save the selection
		WebElement doneButton = driver.findElement(By.cssSelector(".a-button-input[type='submit']"));
		doneButton.click();

		// Close the browser
		driver.quit();
		
		}
}