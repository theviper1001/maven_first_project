package com.google.himarsha;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{		@Test
		public void searchhot2() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys("Disha Patni Bikini");
			searchbox.sendKeys(Keys.ENTER);
			 
			WebElement images= driver.findElement(By.linkText("Images"));
			images.click();
			
			Assert.assertEquals(driver.getTitle(),"Disha Patani Bikini - Google Search");
			Thread.sleep(500);
			driver.close();
		
		}
	}


