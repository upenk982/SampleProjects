package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


//Selenium Java API libraries for GUI automation testing
public class TestWikipedia {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "C:/Users/Upen/Downloads/IEDriverServer_x64_2.53.0/IEDriverServer.exe");
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("https://www.wikipedia.org/");
		WebElement link = webDriver.findElement(By.linkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = webDriver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		Thread.sleep(5000);
		webDriver.quit();
	}
}
