package Webdriveruniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autocomplete_textfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		WebElement fooditeminput = driver.findElement(By.id("myInput"));
		fooditeminput.sendKeys("Ap");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(fooditeminput,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement submitbutton = driver.findElement(By.id("submit-button"));
		submitbutton.click();
		driver.quit();
	}

}
