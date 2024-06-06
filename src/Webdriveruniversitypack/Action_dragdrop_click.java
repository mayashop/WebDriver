package Webdriveruniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_dragdrop_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(driver.findElement(By.id("div-drag-drop-thumbnail")));
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		//drag and drop
		Actions ac = new Actions(driver);
		//ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();//first method
		ac.dragAndDrop(sourceElement, targetElement).build().perform();//second method
		Thread.sleep(2000);		
		//double click 
		WebElement doubleclickme =  driver.findElement(By.id("double-click"));
		ac.doubleClick(doubleclickme).perform();		
		//hold over me first
		WebElement holdoverfirst = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		ac.moveToElement(holdoverfirst).build().perform();
		WebElement link1 = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
		link1.click();
		Thread.sleep(2000);
		Alert alertmessage = driver.switchTo().alert();
		alertmessage.accept();
		Thread.sleep(2000);
		//hold over me second
		WebElement holdover2 = driver.findElement(By.cssSelector("#div-hover > div:nth-child(2) > button"));
		ac.moveToElement(holdover2).build().perform();
		WebElement link2 = driver.findElement(By.cssSelector("#div-hover > div:nth-child(2) > div > a"));
		link2.click();
		Thread.sleep(2000);
		alertmessage.accept();
		Thread.sleep(2000);
		//hold over me third
		WebElement holdover3 = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
		ac.moveToElement(holdover3).build().perform();
		WebElement link3 = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > div > a:nth-child(2)"));
		link3.click();
		Thread.sleep(2000);
		alertmessage.accept();
		Thread.sleep(2000);
		//hold click
		WebElement holdclick = driver.findElement(By.id("click-box"));
		ac.clickAndHold(holdclick).perform();
		Thread.sleep(2000);
		ac.release(holdclick);
		Thread.sleep(2000);
		driver.quit();
	}
;
}
