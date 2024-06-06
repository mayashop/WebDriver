package Webdriveruniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_portal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("text")) ;
		username.sendKeys("arun");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("arunm@123");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
		Alert arl = driver.switchTo().alert();
		arl.accept();
		driver.close();
	}

}
