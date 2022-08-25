package com.google.himarsha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class search {

	@Test
	public void searchhot() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Himarsha Venkatswamy Bikini");
		searchbox.sendKeys(Keys.ENTER);
		 
		WebElement images= driver.findElement(By.linkText("Images"));
		images.click();
		
		Assert.assertEquals(driver.getTitle(),"Himarsha Venkatsamy Bikini - Google Search");
		Thread.sleep(500);
		driver.close();
	
	}
}
