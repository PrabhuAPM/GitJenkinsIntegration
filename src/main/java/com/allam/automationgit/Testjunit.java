package com.allam.automationgit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testjunit {

	WebDriver driver=null;
	@Test
	public void sampletest()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Hi Github and Jenkins and Maven");
	}
}
