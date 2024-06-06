package Webdriveruniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		WebElement elementclick = driver.findElement(By.xpath("//span[@id='button1']"));
		elementclick.click();
		//Alert alert = driver.switchTo().alert();
        // Close the alert (accept)
       //alert.accept(); 
		WebElement jscriptclick =driver.findElement(By.cssSelector("#button2"));
		jscriptclick.click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		WebElement actionclick = driver.findElement(By.id("button3"));
		actionclick.click();
		//Actions ac = new Actions(driver);
		//ac.click().build();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
