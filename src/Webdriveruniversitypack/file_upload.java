package Webdriveruniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement fileupload = driver.findElement(By.id("myFile"));
		fileupload.sendKeys("C:\\Users\\Acer\\Desktop\\Automation\\fig1.mp4");
		Thread.sleep(5000);
		WebElement submitbutton = driver.findElement(By.id("submit-button"));
		submitbutton.click();
		Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
		driver.quit();

	}

}
