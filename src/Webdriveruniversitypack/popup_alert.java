package Webdriveruniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		WebElement JavaScriptalert = driver.findElement(By.id("button1"));
		JavaScriptalert.click();
		Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        WebElement ModalPopup = driver.findElement(By.id("button2"));
        ModalPopup.click();
        Thread.sleep(2000);
       // alert.dismiss();
       WebElement popupalertclose =driver.findElement(By.cssSelector("#myModal > div > div > div.modal-footer > button"));
       popupalertclose.click();
       Thread.sleep(2000);
       WebElement AjaxLoader = driver.findElement(By.id("button3"));
       AjaxLoader.click();
       Thread.sleep(5000);
       WebElement alertclose1 =driver.findElement(By.xpath("//*[@id=\"button1\"]"));
       alertclose1.click();
       Thread.sleep(2000);
       WebElement alertclose2 =driver.findElement(By.cssSelector("#myModalClick > div > div > div.modal-footer > button"));
       alertclose2.click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       WebElement JavaScriptConfirmBox = driver.findElement(By.id("button4"));
       JavaScriptConfirmBox.click();
       Thread.sleep(2000);
       //alert.accept();
       alert.dismiss();
       Thread.sleep(2000);
       driver.quit();
	}

}
