package com.Selenium.TestGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.github.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email_control")).sendKeys("anandtorane1234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-mktg-fluid")).click();
		Thread.sleep(2000);
//		driver.findElement(By.className("HeaderMenu-link")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("login_field")).sendKeys("anandt123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("Anand@7806");
//		Thread.sleep(2000);
//		driver.findElement(By.className("btn")).click();
//		Thread.sleep(2000);
		String a1 = driver.getTitle();
		System.out.println("a1 : "+a1);
		String a2 = "Join";
		driver.close();
		if (a1.equalsIgnoreCase(a2)) {
			System.out.println("github test successfull..");
		} else {
			System.out.println("test faiure..");
		}
	}

}
