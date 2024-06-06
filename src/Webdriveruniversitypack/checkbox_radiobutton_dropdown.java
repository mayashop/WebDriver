package Webdriveruniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox_radiobutton_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		//dropdown
		Select dropdown1 =new Select(driver.findElement(By.id("dropdowm-menu-1")));
		dropdown1.selectByIndex(2);
		Select dropdown2 =new Select(driver.findElement(By.id("dropdowm-menu-2")));
		dropdown2.selectByValue("maven");
		Select dropdown3 =new Select(driver.findElement(By.id("dropdowm-menu-3")));
		dropdown3.selectByVisibleText("CSS");
		//checkbox
		WebElement option2= driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		option2.click();
		WebElement option4= driver.findElement(By.xpath("//*[@value='option-4']"));
		option4.click();
		//radiobutton
		WebElement radiobutton = driver.findElement(By.xpath("//*[@value='yellow']"));
		radiobutton.click();
		//select and disable
		WebElement selectcabbage = driver.findElement(By.xpath("//*[@value='cabbage']"));
		selectcabbage.click();
		WebElement selectLettuce = driver.findElement(By.xpath("//*[@value='lettuce']"));
		selectLettuce.click();
		
		Select appledropdown = new Select(driver.findElement(By.id("fruit-selects")));
		appledropdown.selectByIndex(0);
		Thread.sleep(5000);
		driver.quit();
	}
}
