package Webdriveruniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_us {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Arun");
		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("K");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("arunk@gmail.com");
		WebElement comment = driver.findElement(By.name("message"));
		comment.sendKeys("iam arun");
		Thread.sleep(5000);
		//reset the first name
		WebElement reset = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		reset.click();
		Firstname.sendKeys("Anu");
		Lastname.sendKeys("M");
		email.sendKeys("anum@gmail.com");
		comment.sendKeys("iam anu m");
		
		
		WebElement submitbutton = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		submitbutton.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
