package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//strong[text()=' Items Found']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		for (int i=0;i<bagBrandList.size();i++) {
			String text1 = bagBrandList.get(i).getText();
			System.out.println(text1);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (int i=0;i<bagBrandList.size();i++) {
			String text3 = bagBrandList.get(i).getText();
			System.out.println(text3);
		}
     
	}

}
