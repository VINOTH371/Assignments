package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='row ']/div[text()='Chennai']")).click();	
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		WebElement element = driver.findElement(By.xpath("//h5[@class='title']"));
		String text = element.getText();
		System.out.println("The selected bus is"+text);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]"));
		String text2 = element2.getText();
		System.out.println("Seats:"+text2);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//span[text()='1UC']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement amt=driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String fare=amt.getText();
		
		System.out.println("Total Fare for bus:"+fare);
		
		WebElement SelectSeat=driver.findElement(By.xpath("//div[@class='selected-seat col auto']//div[1]/div[1]"));
		String Seats=SelectSeat.getText();
		
		System.out.println("Seat selected:"+Seats);
		
		}

}
