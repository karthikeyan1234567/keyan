package org.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Food {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Swiggy\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=CjwKCAiAiKuOBhBQEiwAId_sK7dfyFD9DIFfP64PqotBPUpCb0oN4t746uS--Gj0am-97hyRix6nYRoCr9oQAvD_BwE");
		
		WebElement name = driver.findElement(By.id("location"));
		name.sendKeys("salem");
		
	}
	

}
