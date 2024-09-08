package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("54");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543654");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinoth08@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("raja");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("surya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("gandhi street,salem");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("4th corner,salem");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Salem");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636219");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		if (title2.contains("View Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}

	}

}