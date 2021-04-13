package com.Selenium.TestGmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("anandtorane1234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		String a1 = driver.getTitle();
		String a2 = "gmail";
		driver.close();
		if (a1.equalsIgnoreCase(a2)) {
			System.out.println("test successfull..");
		} else {
			System.out.println("test faiure..");
		}
	}

}
