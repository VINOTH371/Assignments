package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://login.salesforce.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SeleniumChallenge@24");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.findElement(By.xpath("//div[@class='slds-r1']")).click();
       driver.findElement(By.xpath("//button[text()='View All']")).click();
       driver.findElement(By.xpath("//p[text()='Sales']")).click();
       WebElement leadButton = driver.findElement(By.xpath("//span[text()='Leads']"));
       driver.executeScript("arguments[0].click()",leadButton);
       driver.findElement(By.xpath("//button[text()='New']")).click();
       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vinoth");
       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("R");
       driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("zoho");
       driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
