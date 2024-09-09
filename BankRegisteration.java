package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankRegisteration {

	public static void main(String[] args) {
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://uibank.uipath.com/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.linkText("Register For Account")).click();
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinoth@gmail.com");
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vinoth@075");
     driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vinoth");
     driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("R");
     driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("VR");
     driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Male");
     driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Mr");
     driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Full-time");
     driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
     driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("single");
     driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("1");
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vinoth");
     String title = driver.getTitle();
     if(title.contains("UiBank")) {
    	 System.out.println("Title is verified");
     }
     else {
    	 System.out.println("Title is not verified");
     }
     
	}

}