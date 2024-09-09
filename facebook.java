package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.linkText("Create new account")).click();
       driver.findElement(By.name("firstname")).sendKeys("vinoth");
       driver.findElement(By.name("lastname")).sendKeys("R");
       driver.findElement(By.name("reg_email__")).sendKeys("vinoth@gmail.com");
	   driver.findElement(By.name("reg_passwd__")).sendKeys("2375001");
	   String title = driver.getTitle();
	   if(title.contains("facebook")) {
		   System.out.println("Title is verified");
	   }
	   else {
		   System.out.println("Title is not verified");
	   }
     
   		
    		  
	}

}
